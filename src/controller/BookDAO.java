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
public interface BookDAO<E, K> {
    
    public void insert(E entity);
    public void update(E entity);
    public void delete(K key);
    public List<E> selectAll();
    public E selectById(K key);
}
