package com.Mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import java.lang.module.Configuration;

public class Main {
    public static void main() throws Exception{
        laptop l1 = new laptop();
        l1.setBrand("HP");
        l1.setModel("i9");
        l1.setRam(16);
        newClass nc = new newClass();
        nc.setAid(1);
        nc.setAname("Mat");
        nc.setTech("MME");
        nc.setLaptop(l1);


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.Mohit.newClass.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tt = ss.beginTransaction();
        ss.persist(nc);
        tt.commit();

        newClass n = ss.find(newClass.class,1);
        System.out.println(n);
        ss.close();
        sf.close();
    }
}
