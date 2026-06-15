package com.Mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import java.lang.module.Configuration;

public class Main {
    public static void main() throws Exception{

        newClass nc = new newClass();
        nc.setAid(101);
        nc.setAname("Max");
        nc.setTech("CSE");


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.Mohit.newClass.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        ss.close();
        sf.close();
    }
}
