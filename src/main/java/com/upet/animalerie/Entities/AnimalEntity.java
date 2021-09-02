package com.upet.animalerie.Entities;


import javax.persistence.*;

@Entity
@Table(name = "animal")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "espece")
    private Integer espece;

    @Column(name = "disponibilite")
    private Integer disponibilite;

    @Column(name = "sexe")
    private Integer sexe;

    @Column(name = "age")
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "espece", referencedColumnName = "id")
    private TypeAnimalEntity id_type_espece;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEspece() {
        return espece;
    }

    public void setEspece(Integer espece) {
        this.espece = espece;
    }

    public Integer getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Integer disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Integer getSexe() {
        return sexe;
    }

    public void setSexe(Integer sexe) {
        this.sexe = sexe;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TypeAnimalEntity getId_type_espece() {
        return id_type_espece;
    }

    public void setId_type_espece(TypeAnimalEntity id_type_espece) {
        this.id_type_espece = id_type_espece;
    }
}
