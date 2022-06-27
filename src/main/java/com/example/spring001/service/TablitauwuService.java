/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.spring001.service;

import com.example.spring001.entity.Tablitauwu;
import java.util.List;

/**
 *
 * @author alarc
 */
public interface TablitauwuService {

    int create(Tablitauwu tablita);

    int update(Tablitauwu tablita);

    int delete(int idventa);

    Tablitauwu read(int idventa);

    List<Tablitauwu> readAll();
}
