package com.lab2.repository;
// import com.lab2.dto.ReporteMascotasDTO;
import com.lab2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Repositorio de Mascota. Extiende JpaRepository, asi que el CRUD basico
 * (save, findById, findAll, deleteById...) ya viene heredado sin escribir
 * nada mas: aqui solo se agrega lo que el laboratorio pide explicitamente.
 */
public class EmployeeRepository {
}
