package com.marcosvinicisudev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Autor {

    @Id
    private int id;
    private String nome;

}
