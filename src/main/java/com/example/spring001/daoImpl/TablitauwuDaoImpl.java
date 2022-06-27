/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring001.daoImpl;

import com.example.spring001.dao.TablitaDAO;
import com.example.spring001.entity.Tablitauwu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alarc
 */
@Repository
public class TablitauwuDaoImpl implements TablitaDAO{
@Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Tablitauwu tablita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Tablitauwu tablita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tablitauwu read(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tablitauwu> readAll() {
        
       String SQL = "SELECT ventas.idventa AS \"id\",personas.nombres AS \"cliente\" ,sucursales.direccion AS \"sucursal\",empleados.nombre AS \"vendedor\",ventas.fecha AS \"fecha\" FROM clientes,ventas,sucursales,personas,empleados;";        
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Tablitauwu.class));
    }
    
}
