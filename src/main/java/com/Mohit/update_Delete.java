package com.Mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class update_Delete {
    static void main() {
        Student s1 = new Student();
        s1.setRoll(24);
        s1.setAge(43);
        s1.setName("meena");
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.Mohit.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tt = ss.beginTransaction();
        ss.merge(s1);
        tt.commit();
        ss.close();
        sf.close();
        System.out.println(s1);
    }
}
