/*Apagar tabelas*/
  truncate table studentmanagementsys.student_has_academic_unit;
  truncate table studentmanagementsys.subject;
  truncate table studentmanagementsys.academic_unit;
  truncate table studentmanagementsys.semester;
  truncate table studentmanagementsys.user_role;
  truncate table studentmanagementsys.user;
  truncate table studentmanagementsys.role;

/*Select de todas as tabelas individuais*/
  select * from studentmanagementsys.role;
  select * from studentmanagementsys.user;
  select * from studentmanagementsys.user_role;
  select * from studentmanagementsys.semester;
  select * from studentmanagementsys.academic_unit;
  select * from studentmanagementsys.subject;
  select * from studentmanagementsys.student_has_academic_unit;

/*Insert de todas as tabelas*/
  --role
    insert into studentmanagementsys.role (slug, description) values ('user', 'Usuário padrão para o sistema');
    insert into studentmanagementsys.role (slug, description) values ('admin', 'Usuário administrador para o sistema');
    insert into studentmanagementsys.role (slug, description) values ('student', 'Usuário student para o sistema');
    insert into studentmanagementsys.role (slug, description) values ('professor', 'Usuário professor para o sistema');

  --user
    insert into studentmanagementsys.user (name, cpf, email, password, tel, birth_date, gender, marital_status, mother_name, father_name) values ('Aluno', '11111111111', 'aluno@teste.com', '12345', '11111111111', '2005-01-01', 'm', 's', 'Mãe teste', 'Pai teste');
    insert into studentmanagementsys.user (name, cpf, email, password, tel, birth_date, gender, marital_status, mother_name, father_name) values ('Professor', '11111111111', 'professor@teste.com', '12345', '11111111112', '2005-01-01', 'm', 's', 'Mãe teste', 'Pai teste');
    insert into studentmanagementsys.user (name, cpf, email, password, tel, birth_date, gender, marital_status, mother_name, father_name) values ('Admin', '11111111111', 'admin@teste.com', '12345', '11111111112', '2005-01-01', 'm', 's', 'Mãe teste', 'Pai teste');

  --user_role
    insert into studentmanagementsys.user_role (user_id, role_slug) values (1, 'user');
    insert into studentmanagementsys.user_role (user_id, role_slug) values (3, 'admin');
    insert into studentmanagementsys.user_role (user_id, role_slug) values (2, 'professor');
    insert into studentmanagementsys.user_role (user_id, role_slug) values (2, 'student');

  --semester
    insert into studentmanagementsys.semester (name) values ('1 semestre');
    insert into studentmanagementsys.semester (name) values ('2 semestre');
    insert into studentmanagementsys.semester (name) values ('3 semestre');
    insert into studentmanagementsys.semester (name) values ('4 semestre');
    insert into studentmanagementsys.semester (name) values ('5 semestre');
    insert into studentmanagementsys.semester (name) values ('6 semestre');
    insert into studentmanagementsys.semester (name) values ('7 semestre');
    insert into studentmanagementsys.semester (name) values ('8 semestre');
    insert into studentmanagementsys.semester (name) values ('9 semestre');
    insert into studentmanagementsys.semester (name) values ('10 semestre');
    insert into studentmanagementsys.semester (name) values ('11 semestre');
    insert into studentmanagementsys.semester (name) values ('12 semestre');

  --academic_unit
    insert into studentmanagementsys.academic_unit (name) values ('Desenvolvimento de Software');
    insert into studentmanagementsys.academic_unit (name) values ('Hardware');
    insert into studentmanagementsys.academic_unit (name) values ('Gestão em TI');

  --subject
    insert into studentmanagementsys.subject (academic_unit_id, name) values (1, 'Programação em Java');
    insert into studentmanagementsys.subject (academic_unit_id, name) values (1, 'Banco de dados');
    insert into studentmanagementsys.subject (academic_unit_id, name) values (1, 'Lógica de programação');
    insert into studentmanagementsys.subject (academic_unit_id, name) values (2, 'Sistema operacional');
    insert into studentmanagementsys.subject (academic_unit_id, name) values (2, 'Componentes internos');
    insert into studentmanagementsys.subject (academic_unit_id, name) values (3, 'PowerBI');
    insert into studentmanagementsys.subject (academic_unit_id, name) values (3, 'Gerenciamento de projetos');

  --student_has_academic_unit
    insert into studentmanagementsys.student_has_academic_unit (student_id, professor_id, academic_unit_id, semester_id) values (1, 2, 1, 1);

/*Update de todas as tabelas*/
  --student_has_academic_unit
    update studentmanagementsys.student_has_academic_unit set grade = 100.00 where student_has_academic_unit = 1;

/*Delete de todas as tabelas individuais*/
  delete from studentmanagementsys.student_has_academic_unit where id = 1;
  delete from studentmanagementsys.subject where id = 1;
  delete from studentmanagementsys.academic_unit where id = 1;
  delete from studentmanagementsys.semester where id = 1;
  delete from studentmanagementsys.user_role where id = 1;
  delete from studentmanagementsys.user where id = 1;
  delete from studentmanagementsys.role where id = 1;

/*View de todas as tabelas*/
/*
Permissões (role) = (cadastrar, listar, update, delete)
Usuário (user) -> user_role = (cadastrar, listar, update, delete)
Unidade Curricular (academic_unit) = (cadastrar, listar, update, delete)
Matéria (subject) -> academic_unit_id (cadastrar, listar, update, delete)
UC's por usuário (student_has_academic_unit) -> student_id, professor_id, academic_unit_id, semester_id
*/

  --user_uc_vw
    select
        suc.id,
        st.id as student_id,
        st.name as student_name,
        st.cpf as student_cpf,
        st.email as student_email,
        st.tel as student_tel,
        st.birth_date as student_birth_date,
        st.gender as student_gender,
        st.marital_status as student_marital_status,
        st.mother_name as student_mother_name,
        st.father_name as student_father_name,
        pr.id as professor_id,
      pr.name as professor_name,
      pr.cpf as professor_cpf,
      pr.email as professor_email,
      pr.tel as professor_tel,
      pr.birth_date as professor_birth_date,
      pr.gender as professor_gender,
      pr.marital_status as professor_marital_status,
      pr.mother_name as professor_mother_name,
      pr.father_name as professor_father_name,
        uc.id as academic_unit_id,
        uc.name as academic_unit_name,
        sm.id as semester_id,
        sm.name as semester_name,
        suc.grade
    from studentmanagementsys.student_has_academic_unit suc
    join studentmanagementsys.user st on st.id = suc.student_id
    join studentmanagementsys.user pr on pr.id = suc.professor_id
    join studentmanagementsys.academic_unit uc on uc.id = suc.academic_unit_id
    join studentmanagementsys.semester sm on sm.id = suc.semester_id
    ;