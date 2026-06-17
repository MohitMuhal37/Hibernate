package com.Mohit;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;


@Entity
public class laptop {
        @Id
        private int lid;
        private String brand;
        private String model;
        private int ram;
        @ManyToOne
        private newClass newClass;

    public newClass getNewClass() {
        return newClass;
    }

    public void setNewClass(newClass newClass) {
        this.newClass = newClass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
