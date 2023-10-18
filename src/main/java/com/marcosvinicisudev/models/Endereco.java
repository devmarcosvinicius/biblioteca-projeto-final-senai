package com.marcosvinicisudev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Endereco {

    @Id
    private int id;

    private String rua;
    private String quadra;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

}
