/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import com.raven.db.ConnectionFactory;
import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SubjectModel;
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
public class SubjectsRepository implements IRepository<SubjectModel> {

    @Override
    public boolean create(SubjectModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("insert into studentmanagementsys.subject (name, description, academic_unit_id) values (?, ?, ?);");
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getDescription());
            stmt.setInt(3, object.getAcademic_unit().getId());
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
    public boolean update(SubjectModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("update studentmanagementsys.subject \n"
                    + "set name = ?,\n"
                    + "	description = ?,\n"
                    + "    academic_unit_id = ?\n"
                    + "where id = ?;");
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getDescription());
            stmt.setInt(3, object.getAcademic_unit().getId());
            stmt.setInt(4, object.getId());
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
    public SubjectModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SubjectModel> getAll() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<SubjectModel> subjectList = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select \n"
                    + "	sub.id,\n"
                    + "    sub.name,\n"
                    + "    sub.description,\n"
                    + "    uc.id as academic_unit_id,\n"
                    + "    uc.name as academic_unit_name\n"
                    + "from subject sub\n"
                    + "join academic_unit uc on sub.academic_unit_id = uc.id;");
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                AcademicUnitModel academicUnitModel = new AcademicUnitModel(rs.getInt("academic_unit_id"), rs.getString("academic_unit_name"));
                SubjectModel subject = new SubjectModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        academicUnitModel
                );
                subjectList.add(subject);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return subjectList;
    }

    @Override
    public boolean delete(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
       
        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("DELETE FROM studentmanagementsys.subject WHERE id = ?;");
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
