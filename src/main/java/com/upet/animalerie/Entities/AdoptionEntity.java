package com.upet.animalerie.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "adoption")
public class AdoptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "adoption_traitee")
    private Integer adoption_traitee;

    @Column(name = "date_adoption")
    private LocalDate date_adoption;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animal", referencedColumnName = "id")
    private AnimalEntity id_animal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adoptant", referencedColumnName = "id")
    private UserEntity id_adoptant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendeur", referencedColumnName = "id")
    private UserEntity id_vendeur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdoption_traitee() {
        return adoption_traitee;
    }

    public void setAdoption_traitee(Integer adoption_traitee) {
        this.adoption_traitee = adoption_traitee;
    }

    public LocalDate getDate_adoption() {
        return date_adoption;
    }

    public void setDate_adoption(LocalDate date_adoption) {
        this.date_adoption = date_adoption;
    }

    public void setId_animal(AnimalEntity id_animal) {
        this.id_animal = id_animal;
    }

    public void setId_adoptant(UserEntity id_adoptant) {
        this.id_adoptant = id_adoptant;
    }

    public void setId_vendeur(UserEntity id_vendeur) {
        this.id_vendeur = id_vendeur;
    }
}
