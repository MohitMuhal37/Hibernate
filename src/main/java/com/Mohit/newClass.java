package com.Mohit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class newClass {
    @Id
        private int aid;
        private String aname;
        private String tech;
        private laptop laptop;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "newClass{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
