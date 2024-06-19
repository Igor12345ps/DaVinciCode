/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import com.raven.db.ConnectionFactory;
import com.raven.db.models.AcademicUnitModel;
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
public class AcademicUnitRepository implements IRepository<AcademicUnitModel> {
    
    @Override
    public boolean create(AcademicUnitModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
       
        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("insert into studentmanagementsys.academic_unit (name) values (?)");
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
    public boolean update(AcademicUnitModel object) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
       
        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("UPDATE studentmanagementsys.academic_unit SET name = ? WHERE id = ?;");
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
    public AcademicUnitModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AcademicUnitModel> getAll() {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida

        List<AcademicUnitModel> academicList = new ArrayList<>();

        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("SELECT id, name FROM academic_unit");
            rs = stmt.executeQuery(); // Executa o comando SQL

            /* Loop responsável pela busca dos dados no banco que o repetirá até que não haja valores */
            while (rs.next()) {
                AcademicUnitModel academic = new AcademicUnitModel(
                        rs.getInt("id"),
                        rs.getString("name")
                );
                academicList.add(academic); // Adiciona o objeto à lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return academicList;
    }

    @Override
    public boolean delete(Integer id) {
        ConnectionFactory cf = new ConnectionFactory();
        Connection con = cf.obtemConexao(); // Busca uma conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
       
        try {
            // Inserindo o comando SQL a ser usado
            stmt = con.prepareStatement("DELETE FROM studentmanagementsys.academic_unit WHERE id = ?;");
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
