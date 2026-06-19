package com.Mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

//import java.lang.module.Configuration;

public class Main {
    public static void main() throws Exception{
        laptop l1 = new laptop();
        l1.setBrand("HP");
        l1.setLid(1);
        l1.setModel("i9");
        l1.setRam(16);

        laptop l2 = new laptop();
        l2.setBrand("Dell");
        l2.setLid(2);
        l2.setModel("i7");
        l2.setRam(16);

        laptop l3 = new laptop();
        l3.setBrand("Lenovo");
        l3.setLid(3);
        l3.setModel("i9");
        l3.setRam(32);
        newClass nc = new newClass();
        nc.setAid(1);
        nc.setAname("Mat");
        nc.setTech("MME");

        newClass nc1 = new newClass();
        nc1.setAid(2);
        nc1.setAname("Max");
        nc1.setTech("CSE");

        newClass nc2 = new newClass();
        nc2.setAid(3);
        nc2.setAname("Marry");
        nc2.setTech("CSE");

        nc.setLaptops(Arrays.asList(l1,l2));
        nc1.setLaptops(Arrays.asList(l1,l3));
        nc2.setLaptops(Arrays.asList(l1,l2,l3));

        l1.setNewClass(Arrays.asList(nc,nc1,nc2));
        l2.setNewClass(Arrays.asList(nc,nc2));
        l3.setNewClass(Arrays.asList(nc1,nc2));
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.Mohit.newClass.class).addAnnotatedClass(com.Mohit.laptop.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tt = ss.beginTransaction();
        ss.persist(l1);
        ss.persist(l2);
        ss.persist(l3);

        ss.persist(nc);
        ss.persist(nc1);
        ss.persist(nc2);
        tt.commit();

        newClass n = ss.find(newClass.class,2);
        System.out.println(n);
        ss.close();
        sf.close();
    }
}
