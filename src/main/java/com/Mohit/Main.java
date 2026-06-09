package com.Mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import java.lang.module.Configuration;

public class Main {
    public static void main() throws Exception{
        Student s1 = new Student();
        Student s2 = null;
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.Mohit.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        s2 = ss.find(Student.class,24);
        ss.close();
        sf.close();
        System.out.println(s2);
    }
}
