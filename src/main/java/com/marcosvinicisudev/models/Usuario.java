package com.marcosvinicisudev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    private int id;
    private String nome;
    private String email;

    @ManyToOne
    private Telefone telefone;

}
