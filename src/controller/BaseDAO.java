/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface BaseDAO<E, K> {
    
    public boolean insert(E entity) throws Exception;
    public boolean update(E entity) throws Exception;
    public boolean delete(K key) throws Exception;
    public List<Object[]> selectBySQL();
    public E selectById(K key);
}
