package com.lab2.controller;
import com.lab2.model.Employee;

import com.lab2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Controller unico para el modulo de Empleados.
 */
@Controller
@RequestMapping("/empleados")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public String listar(@RequestParam(required = false) String criterio,
                         @RequestParam(required = false) String valor,
                         Model model) {

        List<Employee> empleados = (criterio != null && valor != null && !valor.isBlank())
                ? employeeService.buscar(criterio, valor)
                : employeeService.listarTodas();

        model.addAttribute("empleados", empleados);
        // Se reenvian criterio/valor a la vista para que el formulario de
        // busqueda "recuerde" lo ultimo buscado (selector + texto).
        model.addAttribute("criterio", criterio);
        model.addAttribute("valor", valor);
        return "empleados/listar";
    }
}
