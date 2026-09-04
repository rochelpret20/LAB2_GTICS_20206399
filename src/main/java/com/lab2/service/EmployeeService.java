package com.lab2.service;

// import com.lab2.dto.  DTO;

import com.lab2.model.Employee;
import com.lab2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* Arquitectura en capas resultante:
        *   Vista (Thymeleaf) <-> Controller <-> Service <-> Repository <-> BD
 */
@Service
public class EmployeeService {
    private final EmployeeService employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {this.employeeRepository = employeeRepository;
    }

    /** Listado completo (Pregunta 2, y estado "sin filtros" de la Pregunta 3). */
    public List<Employee> listarTodas() {
        return employeeRepository.findAll();
    }

    public Employee buscarPorId(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No existe ningún empleado con id " + id));
    }
}
