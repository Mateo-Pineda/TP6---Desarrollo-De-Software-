package com.example.Tp6.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Domicilio")
public class Domicilio extends Base{

    @Column(name = "Calle")
    private String Calle;

    @Column(name = "Número")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_Localidad")
    private Localidad localidad;


}