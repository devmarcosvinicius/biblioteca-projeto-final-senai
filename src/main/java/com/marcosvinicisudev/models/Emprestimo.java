package com.marcosvinicisudev.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
public class Emprestimo {

    @Id
    private int id;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "data_emprestimo")
    private Date dataEmprestimo;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "data_devolucao_prevista")
    private Date dataDevolucaoPrevista;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "data_devolucao_real")
    private Date dataDevolucaoReal;

    @ManyToOne
    private Autor autor;

}
