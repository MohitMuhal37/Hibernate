package com.Mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class update_Delete {
    static void main() {
        Student s1 = new Student();
        s1.setRoll(24);
        s1.setAge(52);
        s1.setName("meena");
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
