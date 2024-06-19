/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.repository;

import java.util.List;

/**
 *
 * @author 823117978
 */
public interface IRepository<I> {
    
    public boolean create(I object);
    public boolean update(I object);
    public I get(Integer id);
    public List<I> getAll();
    public boolean delete(Integer id);
}
