/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import com.raven.db.ConnectionFactory;
import com.raven.db.enums.GenderEnum;
import com.raven.db.enums.MaritalStatusEnum;
import com.raven.db.enums.RoleEnum;
import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SemesterModel;
import com.raven.db.models.SubjectModel;
import com.raven.db.models.ClassModel;
import com.raven.db.models.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 823122036
 */
public class ClassRepository implements IRepository<ClassModel> {

    @Override
    public boolean create(ClassModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("INSERT INTO studentmanagementsys.student_has_academic_unit\n"
                    + "(`student_id`,\n"
                    + "`professor_id`,\n"
                    + "`academic_unit_id`,\n"
                    + "`semester_id`)\n"
                    + "VALUES\n"
                    + "(?,?,?,?);");
            stmt.setInt(1, object.getStudent().getId());
            stmt.setInt(2, object.getProfessor().getId());
            stmt.setInt(3, object.getAcademicUnit().getId());
            stmt.setInt(4, object.getSemester().getId());
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                return true; // Sucesso
            } else {
                return false; // Falha
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(ClassModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("update studentmanagementsys.student_has_academic_unit\n"
                    + "set student_id = ?,\n"
                    + "	professor_id = ?,\n"
                    + "    academic_unit_id = ?,\n"
                    + "    semester_id = ?\n"
                    + "where id = ?;");
            stmt.setInt(1, object.getStudent().getId());
            stmt.setInt(2, object.getProfessor().getId());
            stmt.setInt(3, object.getAcademicUnit().getId());
            stmt.setInt(4, object.getSemester().getId());
            stmt.setInt(5, object.getId());
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                return true; // Sucesso
            } else {
                return false; // Falha
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

    }

    @Override
    public ClassModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ClassModel> getAll() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<ClassModel> userAcademicUnitList = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select * from studentmanagementsys.vw_class;");
            rs = stmt.executeQuery(); // Executa o comando SQL

            AcademicUnitModel academicUnit;
            SubjectModel subject;

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                academicUnit = new AcademicUnitModel(rs.getInt("academic_unit_id"), rs.getString("academic_unit_name"));
                UserModel student = new UserModel(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("student_cpf"),
                        rs.getString("student_email"),
                        null,
                        rs.getString("student_tel"),
                        rs.getDate("student_birth_date"),
                        GenderEnum.fromString(rs.getString("student_gender")),
                        MaritalStatusEnum.fromString(rs.getString("student_marital_status")),
                        rs.getString("student_mother_name"),
                        rs.getString("student_father_name"),
                        null
                );
                UserModel professor = new UserModel(
                        rs.getInt("professor_id"),
                        rs.getString("professor_name"),
                        rs.getString("professor_cpf"),
                        rs.getString("professor_email"),
                        null,
                        rs.getString("professor_tel"),
                        rs.getDate("professor_birth_date"),
                        GenderEnum.fromString(rs.getString("professor_gender")),
                        MaritalStatusEnum.fromString(rs.getString("professor_marital_status")),
                        rs.getString("professor_mother_name"),
                        rs.getString("professor_father_name"),
                        null
                );
                SemesterModel semester = new SemesterModel(rs.getInt("semester_id"), rs.getString("semester_name"));
                ClassModel userClass = new ClassModel(rs.getInt("id"), student, professor, academicUnit, semester, rs.getDouble("grade"));
                userAcademicUnitList.add(userClass);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userAcademicUnitList;

    }

    public List<ClassModel> getAllByProfessorId(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<ClassModel> userAcademicUnitList = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select * from studentmanagementsys.vw_class where professor_id = ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Executa o comando SQL

            AcademicUnitModel academicUnit;
            SubjectModel subject;

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                academicUnit = new AcademicUnitModel(rs.getInt("academic_unit_id"), rs.getString("academic_unit_name"));
                UserModel student = new UserModel(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("student_cpf"),
                        rs.getString("student_email"),
                        null,
                        rs.getString("student_tel"),
                        rs.getDate("student_birth_date"),
                        GenderEnum.fromString(rs.getString("student_gender")),
                        MaritalStatusEnum.fromString(rs.getString("student_marital_status")),
                        rs.getString("student_mother_name"),
                        rs.getString("student_father_name"),
                        null
                );
                UserModel professor = new UserModel(
                        rs.getInt("professor_id"),
                        rs.getString("professor_name"),
                        rs.getString("professor_cpf"),
                        rs.getString("professor_email"),
                        null,
                        rs.getString("professor_tel"),
                        rs.getDate("professor_birth_date"),
                        GenderEnum.fromString(rs.getString("professor_gender")),
                        MaritalStatusEnum.fromString(rs.getString("professor_marital_status")),
                        rs.getString("professor_mother_name"),
                        rs.getString("professor_father_name"),
                        null
                );
                SemesterModel semester = new SemesterModel(rs.getInt("semester_id"), rs.getString("semester_name"));
                ClassModel userClass = new ClassModel(rs.getInt("id"), student, professor, academicUnit, semester, rs.getDouble("grade"));
                userAcademicUnitList.add(userClass);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userAcademicUnitList;

    }
    
    public List<ClassModel> getAllByStudentId(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<ClassModel> userAcademicUnitList = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select * from studentmanagementsys.vw_class where student_id = ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Executa o comando SQL

            AcademicUnitModel academicUnit;
            SubjectModel subject;

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                academicUnit = new AcademicUnitModel(rs.getInt("academic_unit_id"), rs.getString("academic_unit_name"));
                UserModel student = new UserModel(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("student_cpf"),
                        rs.getString("student_email"),
                        null,
                        rs.getString("student_tel"),
                        rs.getDate("student_birth_date"),
                        GenderEnum.fromString(rs.getString("student_gender")),
                        MaritalStatusEnum.fromString(rs.getString("student_marital_status")),
                        rs.getString("student_mother_name"),
                        rs.getString("student_father_name"),
                        null
                );
                UserModel professor = new UserModel(
                        rs.getInt("professor_id"),
                        rs.getString("professor_name"),
                        rs.getString("professor_cpf"),
                        rs.getString("professor_email"),
                        null,
                        rs.getString("professor_tel"),
                        rs.getDate("professor_birth_date"),
                        GenderEnum.fromString(rs.getString("professor_gender")),
                        MaritalStatusEnum.fromString(rs.getString("professor_marital_status")),
                        rs.getString("professor_mother_name"),
                        rs.getString("professor_father_name"),
                        null
                );
                SemesterModel semester = new SemesterModel(rs.getInt("semester_id"), rs.getString("semester_name"));
                ClassModel userClass = new ClassModel(rs.getInt("id"), student, professor, academicUnit, semester, rs.getDouble("grade"));
                userAcademicUnitList.add(userClass);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userAcademicUnitList;

    }
    
    @Override
    public boolean delete(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
       
        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("DELETE FROM studentmanagementsys.student_has_academic_unit WHERE id = ?;");
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                return true; // Sucesso
            } else {
                return false; // Falha
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
}
