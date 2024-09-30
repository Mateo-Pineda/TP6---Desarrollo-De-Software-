package com.example.Tp6.repositories;

import com.example.Tp6.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{
     List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    boolean existsByDni(int dni);

    @Query(value = "SELECT p FROM persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %:Filtro%")
    List<Persona> search(@Param("Filtro") String filtro);

    @Query(value = "SELECT p FROM persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %:Filtro%")
    Page<Persona> search(@Param("Filtro") String filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:Filtro% OR persona.apellido LIKE %:Filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("Filtro") String filtro);

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:Filtro% OR persona.apellido LIKE %:Filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("Filtro") String filtro, Pageable pageable);
}
