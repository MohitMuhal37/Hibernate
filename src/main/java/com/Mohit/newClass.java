package com.Mohit;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class newClass {
    @Id
        private int aid;
        private String aname;
        private String tech;
        @OneToMany
        private List<laptop> laptops;

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

    public List<laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "newClass{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
