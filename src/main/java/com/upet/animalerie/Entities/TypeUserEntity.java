package com.upet.animalerie.Entities;

import javax.persistence.*;

@Entity
@Table(name = "type_utilisateur")

public class TypeUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name = "libellé")
    private String libelle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libellé) {
        this.libelle = libellé;
    }
}
