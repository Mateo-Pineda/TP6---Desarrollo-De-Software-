package com.example.Tp6.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Audited
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Libro")
public class Libro extends Base {

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Fecha")
    private int fecha;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Paginas")
    private int paginas;

    @Column(name = "Autor")
    private String autor;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
