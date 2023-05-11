package com.example.homework_3;

public class Plants {

     // поля сущности
     private String name; // поле названия животного
     private String plantDescription; // поле описания животного
     private int plantResource; // поле ресурса животного
     private String populationSize; // поле численности популяции

     // конструктор
     public Plants(String name, String animalDescription, int animalResource, String populationSize) {
          this.name = name;
          this.plantDescription = animalDescription;
          this.plantResource = animalResource;
          this.populationSize = populationSize;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getPlantDescription() {
          return plantDescription;
     }

     public void setPlantDescription(String plantDescription) {
          this.plantDescription = plantDescription;
     }

     public int getPlantResource() {
          return plantResource;
     }

     public void setPlantResource(int plantResource) {
          this.plantResource = plantResource;
     }

     public String getPopulationSize() {
          return populationSize;
     }

     public void setPopulationSize(String populationSize) {
          this.populationSize = populationSize;
     }
}