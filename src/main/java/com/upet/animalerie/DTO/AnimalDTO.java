package com.upet.animalerie.DTO;

public class AnimalDTO {

    private String name;
    private Integer espece;
    private Integer diponibilite;
    private Integer sexe;
    private Integer age;
    private String vendeur;
    private String adresseImage;

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

    public String getVendeur() {
        return vendeur;
    }

    public void setVendeur(String vendeur) {
        this.vendeur = vendeur;
    }

    public String getAdresseImage() {
        return adresseImage;
    }

    public void setAdresseImage(String adresseImage) {
        this.adresseImage = adresseImage;
    }

    @Override
    public String toString() {
        return "AnimalDTO{" +
                "name='" + name + '\'' +
                ", espece=" + espece +
                ", diponibilite=" + diponibilite +
                ", sexe=" + sexe +
                ", age=" + age +
                ", vendeur='" + vendeur + '\'' +
                ", adresseImage='" + adresseImage + '\'' +
                '}';
    }
}
