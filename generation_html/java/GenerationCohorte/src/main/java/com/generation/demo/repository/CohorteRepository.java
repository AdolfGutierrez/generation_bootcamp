package com.generation.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generation.demo.model.Cohorte;

@Repository // Integer esta relacionado con el ID_COHORTE
public interface CohorteRepository extends JpaRepository<Cohorte, Integer>{
	
//	podemos agregar metodos personalizados
	
	List<Cohorte> findByCiudad(String ciudad);
	
	@Query(value = "SELECT id_instructor, nombre_instructor, nombre_alumno FROM instructor inner join alumno on instructor.cohorte_id = alumno.cohorte_id;", nativeQuery = true)
	List<Map<String,Object>> obtenerInstructorAlumno();

	List<Map<String,Object>>ontenerInstructorAlumno();
	

}
