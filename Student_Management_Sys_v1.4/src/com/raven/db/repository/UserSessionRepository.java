/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import com.raven.db.ConnectionFactory;
import com.raven.db.enums.RoleEnum;
import com.raven.db.models.RoleModel;
import com.raven.db.models.UserSessionModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ipere
 */
public class UserSessionRepository {

    public UserSessionModel login(UserSessionModel oldUserSessionModel) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        UserSessionModel userSessionModel = null;

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select u.*, ur.role_slug, r.description as role_description from studentmanagementsys.user u\n"
                    + "join studentmanagementsys.user_role ur on ur.user_id = u.id\n"
                    + "join studentmanagementsys.role r on r.slug = ur.role_slug\n"
                    + "where u.email = ? and u.password = ?");
            stmt.setString(1, oldUserSessionModel.getEmail());
            stmt.setString(2, oldUserSessionModel.getPassword());
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                RoleModel roleModel = new RoleModel(RoleEnum.fromString(rs.getString("role_slug")), rs.getString("role_slug"), rs.getString("role_description"));
                userSessionModel = new UserSessionModel(rs.getInt("id"), rs.getString("email"), rs.getString("password"), roleModel);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userSessionModel;
    }

}
