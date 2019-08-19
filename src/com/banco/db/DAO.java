package com.banco.db;

import java.util.List;


public interface DAO<T> {
    public void inserir(T obj);
    public List<T> listarTodos();
    public void deletar(T obj);
    public void atualizar(T obj);
    
    
}
