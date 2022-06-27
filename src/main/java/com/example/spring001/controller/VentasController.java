
package com.example.spring001.controller;

import com.example.spring001.service.AlumnoService;
import com.example.spring001.service.TablitauwuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller




@RequestMapping("/ventas")
public class VentasController {
    @Autowired
    private TablitauwuService tablitauwuService;
    
    @GetMapping
    public String listarVentas(Model model){
        model.addAttribute("tablita", tablitauwuService.readAll());
        return "/alumno/ventas";
    } 
}
