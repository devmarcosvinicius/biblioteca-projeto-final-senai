package com.marcosvinicisudev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "usuario_endereco")
public class UsuarioEndereco {

    @Id
    private int id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Endereco endereco;

}
