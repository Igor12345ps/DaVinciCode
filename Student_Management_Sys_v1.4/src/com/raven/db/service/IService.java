package com.raven.db.service;

import java.util.List;

public interface IService<I> {
    
    public boolean create(I object);
    public boolean update(I object);
    public I get(Integer id);
    public List<I> getAll();
    public boolean delete(Integer id);
}
