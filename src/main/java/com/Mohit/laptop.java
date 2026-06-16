package com.Mohit;

public class laptop {
        private String brand;
        private String model;
        private laptop laptop;

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

    public laptop laptop() {
        return laptop;
    }

    public void setlaptop(laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + laptop +
                '}';
    }
}
