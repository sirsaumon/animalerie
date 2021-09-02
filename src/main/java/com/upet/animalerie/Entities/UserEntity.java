package com.upet.animalerie.Entities;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")


public  class UserEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_utilisateur", referencedColumnName = "id")
    private TypeUserEntity id_type_user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeUserEntity getId_type_user() {
        return id_type_user;
    }

    public void setId_type_user(TypeUserEntity id_type_user) {
        this.id_type_user = id_type_user;
    }
}
