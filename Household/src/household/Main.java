/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package household;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AsusZen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize date
        Calendar cal = new GregorianCalendar(1996, 11, 23);
        Calendar cal2 = new GregorianCalendar();
        Calendar cal3 = new GregorianCalendar(2020, 11, 23);
        
        Date birthdate = cal.getTime();        
        Date now = cal2.getTime();
        Date expired = cal.getTime();
        
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/household.odb");
        EntityManager em = emf.createEntityManager();
       
        // CREATE CUSTOMER
        em.getTransaction().begin();
        
        Set<String> phone_nums = new HashSet<String>();
        phone_nums.add("0878");
        phone_nums.add("0812");

        Customer c = new Customer("Alif B", phone_nums, birthdate);
        
        Location loc = new Location("Tubis", "Bandung", "Jawa Barat", "11830");
        c.setAddress(loc);
        
        em.persist(c);
        em.getTransaction().commit();
        
        
        
        em.close();
    }
    
}
