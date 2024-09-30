package com.example.Tp6.services;

import com.example.Tp6.entities.Libro;
import com.example.Tp6.repositories.BaseRepository;
import com.example.Tp6.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository){
        super(baseRepository);
    }


}
