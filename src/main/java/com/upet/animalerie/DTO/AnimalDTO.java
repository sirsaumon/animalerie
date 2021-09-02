package com.upet.animalerie.DTO;

public class AnimalDTO {

    private String name;
    private Integer espece;
    private Integer diponibilite;
    private Integer sexe;
    private Integer age;

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

    public Integer getDiponibilite() {
        return diponibilite;
    }

    public void setDiponibilite(Integer diponibilite) {
        this.diponibilite = diponibilite;
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

    @Override
    public String toString() {
        return "AnimalDTO{" +
                "name='" + name + '\'' +
                ", espece=" + espece +
                ", diponibilite=" + diponibilite +
                ", sexe=" + sexe +
                ", age=" + age +
                '}';
    }
}
