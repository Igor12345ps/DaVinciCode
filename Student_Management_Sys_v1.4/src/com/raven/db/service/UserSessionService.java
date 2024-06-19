/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;

import com.raven.db.models.UserSessionModel;
import com.raven.db.repository.UserSessionRepository;

/**
 *
 * @author ipere
 */
public class UserSessionService {
    
    UserSessionRepository userSessionRepository = new UserSessionRepository();
    
    public UserSessionModel login(UserSessionModel oldUserSessionModel) {
        return userSessionRepository.login(oldUserSessionModel);
    }
}
