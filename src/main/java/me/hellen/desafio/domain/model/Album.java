package me.hellen.desafio.domain.model;

import jakarta.persistence.*;

@Entity(name="albuns")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)

    private String capa;
    @Column(unique = true)

    private String musicaTitulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getMusicaTitulo() {
        return musicaTitulo;
    }

    public void setMusicaTitulo(String musicaTitulo) {
        this.musicaTitulo = musicaTitulo;
    }
}
