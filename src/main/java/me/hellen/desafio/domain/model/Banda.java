package me.hellen.desafio.domain.model;

import jakarta.persistence.*;

@Entity(name = "bandas")
public class Banda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(name ="Genero musical")

    private String genero;
    @Column(name ="Quantidade de integrantes")
    private int integrantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
}
