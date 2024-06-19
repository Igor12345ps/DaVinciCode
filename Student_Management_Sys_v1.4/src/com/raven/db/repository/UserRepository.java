/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import com.raven.db.ConnectionFactory;
import com.raven.db.enums.GenderEnum;
import com.raven.db.enums.MaritalStatusEnum;
import com.raven.db.enums.RoleEnum;
import com.raven.db.models.RoleModel;
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

public class UserRepository implements IRepository<UserModel> {

    @Override
    public boolean create(UserModel userModel) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("CALL insert_user_and_user_role(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            stmt.setString(1, userModel.getName());
            stmt.setString(2, userModel.getCpf().replace("-", "").replace(".", ""));
            stmt.setString(3, userModel.getEmail());
            stmt.setString(4, userModel.getPassword());
            stmt.setString(5, userModel.getTel().replace("(", "").replace(")", "").replace(" ", "").replace("-", ""));
            stmt.setDate(6, new java.sql.Date(userModel.getBirth_date().getTime()));
            stmt.setString(7, (String) userModel.getGender().getValue());
            stmt.setString(8, (String) userModel.getMarital_status().getValue());
            stmt.setString(9, userModel.getMother_name());
            stmt.setString(10, userModel.getFather_name());
            stmt.setString(11, userModel.getRole().getRole_enum().getValue());
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
    public boolean update(UserModel object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean updateUserAndRole(UserModel userModel, RoleEnum oldRole) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("CALL update_user_and_user_role(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            stmt.setInt(1, userModel.getId());
            stmt.setString(2, userModel.getName());
            stmt.setString(3, userModel.getCpf().replace("-", "").replace(".", ""));
            stmt.setString(4, userModel.getEmail());
            stmt.setString(5, userModel.getPassword());
            stmt.setString(6, userModel.getTel().replace("(", "").replace(")", "").replace(" ", "").replace("-", ""));
            stmt.setDate(7, new java.sql.Date(userModel.getBirth_date().getTime()));
            stmt.setString(8, (String) userModel.getGender().getValue());
            stmt.setString(9, (String) userModel.getMarital_status().getValue());
            stmt.setString(10, userModel.getMother_name());
            stmt.setString(11, userModel.getFather_name());
            stmt.setString(12, oldRole.getValue());
            stmt.setString(13, userModel.getRole().getRole_enum().getValue());
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
    public UserModel get(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        UserModel user = new UserModel();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select u.*, ur.role_slug, r.description as role_description from studentmanagementsys.user u\n"
                    + "join studentmanagementsys.user_role ur on ur.user_id = u.id\n"
                    + "join studentmanagementsys.role r on r.slug = ur.role_slug\n"
                    + "where u.id = ?"
            );
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                RoleModel roleModel = new RoleModel(RoleEnum.fromString(rs.getString("role_slug")), rs.getString("role_slug"), rs.getString("role_description"));

                user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("tel"),
                        rs.getDate("birth_date"),
                        GenderEnum.fromString(rs.getString("gender")),
                        MaritalStatusEnum.fromString(rs.getString("marital_status")),
                        rs.getString("mother_name"),
                        rs.getString("father_name"),
                        roleModel
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    @Override
    public List<UserModel> getAll() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<UserModel> users = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select u.*, ur.role_slug, r.description as role_description from studentmanagementsys.user u\n"
                    + "join studentmanagementsys.user_role ur on ur.user_id = u.id\n"
                    + "join studentmanagementsys.role r on r.slug = ur.role_slug");
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                RoleModel roleModel = new RoleModel(RoleEnum.fromString(rs.getString("role_slug")), rs.getString("role_slug"), rs.getString("role_description"));

                UserModel user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("tel"),
                        rs.getDate("birth_date"),
                        GenderEnum.fromString(rs.getString("gender")),
                        MaritalStatusEnum.fromString(rs.getString("marital_status")),
                        rs.getString("mother_name"),
                        rs.getString("father_name"),
                        roleModel
                );

                users.add(user); // Adiciona o objeto na lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }

    public List<UserModel> getAllByRole(String roleSlug) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<UserModel> users = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select u.*, ur.role_slug, r.description as role_description from studentmanagementsys.user u\n"
                    + "join studentmanagementsys.user_role ur on ur.user_id = u.id\n"
                    + "join studentmanagementsys.role r on r.slug = ur.role_slug\n"
                    + "where r.slug = ?");
            stmt.setString(1, roleSlug);
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                RoleModel roleModel = new RoleModel(RoleEnum.fromString(rs.getString("role_slug")), rs.getString("role_slug"), rs.getString("role_description"));
                UserModel user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("tel"),
                        rs.getDate("birth_date"),
                        GenderEnum.fromString(rs.getString("gender")),
                        MaritalStatusEnum.fromString(rs.getString("marital_status")),
                        rs.getString("mother_name"),
                        rs.getString("father_name"),
                        roleModel
                );

                users.add(user); // Adiciona o objeto na lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }

    public List<UserModel> getAllByProfessorId(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<UserModel> users = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select u.*, ur.role_slug, r.description as role_description from studentmanagementsys.user u\n"
                    + "join student_has_academic_unit shau on shau.student_id = u.id\n"
                    + "join user_role ur on ur.user_id = u.id\n"
                    + "join studentmanagementsys.role r on r.slug = ur.role_slug\n"
                    + "where shau.professor_id = ? \n"
                    + "and ur.role_slug = 'student'");
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                RoleModel roleModel = new RoleModel(RoleEnum.fromString(rs.getString("role_slug")), rs.getString("role_slug"), rs.getString("role_description"));
                UserModel user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("tel"),
                        rs.getDate("birth_date"),
                        GenderEnum.fromString(rs.getString("gender")),
                        MaritalStatusEnum.fromString(rs.getString("marital_status")),
                        rs.getString("mother_name"),
                        rs.getString("father_name"),
                        roleModel
                );

                users.add(user); // Adiciona o objeto na lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }

    @Override
    public boolean delete(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("CALL delete_user_and_user_role (?);");
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
