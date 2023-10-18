package com.marcosvinicisudev.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
public class Livro {

    @Id
    private int id;
    private String titulo;

    @DateTimeFormat(pattern = "yyyy")
    @Column(name = "ano_emprestimo")
    private Date anoEmprestimo;

    @Column(name = "n_exemplares")
    private int numeroExemplares;

    @ManyToOne
    private Genero genero;

    @ManyToOne
    private Emprestimo emprestimo;

    @ManyToOne
    private Autor autor;

}
