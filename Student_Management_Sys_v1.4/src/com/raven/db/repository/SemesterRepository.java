/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import com.raven.db.ConnectionFactory;
import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SemesterModel;
import com.raven.db.models.SubjectModel;
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
public class SemesterRepository implements IRepository<SemesterModel> {

    @Override
    public boolean create(SemesterModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("insert into studentmanagementsys.semester (name) values (?);");
            stmt.setString(1, object.getName());
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
    public boolean update(SemesterModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("update studentmanagementsys.semester set name = ? where id = ?;");
            stmt.setString(1, object.getName());
            stmt.setInt(2, object.getId());
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
    public SemesterModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public SemesterModel getByName(String name) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        SemesterModel semester = null;

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select * from semester where name = ?;");
            stmt.setString(1, name);
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                SemesterModel semesterModel = new SemesterModel(rs.getInt("id"), rs.getString("name"));
                semester = semesterModel;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return semester;
    }

    @Override
    public List<SemesterModel> getAll() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<SemesterModel> semesterList = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("select * from semester;");
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                SemesterModel semesterModel = new SemesterModel(rs.getInt("id"), rs.getString("name"));
                semesterList.add(semesterModel);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return semesterList;
    }

    @Override
    public boolean delete(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
       
        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("DELETE FROM studentmanagementsys.semester WHERE id = ?;");
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
