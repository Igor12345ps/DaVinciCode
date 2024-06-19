/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;
import com.raven.db.enums.RoleEnum;
import com.raven.db.models.UserModel;
import com.raven.db.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;


public class UserService implements IService<UserModel> {
    
    UserRepository userRepository = new UserRepository();
    
    @Override
    public boolean create(UserModel userModel) {
        return userRepository.create(userModel);
    }

    @Override
    public boolean update(UserModel object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean updateUserAndRole(UserModel userModel, RoleEnum oldRole) {
        return userRepository.updateUserAndRole(userModel, oldRole);
    }

    @Override
    public UserModel get(Integer id) {
        return userRepository.get(id);
    }

    @Override
    public List<UserModel> getAll() {
        List<UserModel> users = new ArrayList<UserModel>();
        users = userRepository.getAll();
        return users;
    }
    
    public List<UserModel> getAllByRole(String roleSlug){
        List<UserModel> users = new ArrayList<UserModel>();
        users = userRepository.getAllByRole(roleSlug);
        return users;
    }
    
    public List<UserModel> getAllByProfessorId(Integer id) {
        List<UserModel> users = new ArrayList<UserModel>();
        users = userRepository.getAllByProfessorId(id);
        return users;
    }
    
    @Override
    public boolean delete(Integer id) {
        return userRepository.delete(id);
    }
}
