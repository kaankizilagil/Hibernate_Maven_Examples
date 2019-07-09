package March7Hib.Week_5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import March7Hib.Entity.Person;
import March7Hib.Entity.Student;
import March7Hib.Util.HibernateUtil;


public class App 
{
	public static void main( String[] args )
    {
        
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        // start a transaction
        transaction = (Transaction) session.beginTransaction();
            
        Person p1 = new Person("KAAN");
        Student s1 = new Student("VARTKES", "IAU");
        Student s2 = new Student("ERDEM", "ITU");
        Student s3 = new Student("VARTKES", "ITU");
            
        // save the student objects
        session.save(p1);
        session.save(s1);
        session.save(s2);
        session.save(s3);
            
        // commit transaction
        transaction.commit();
       
        session = HibernateUtil.getSessionFactory().openSession();
        List < Student > students = session.createQuery("from Student", Student.class).list();
            
        for(Student stud: students) {
        	System.out.printf("%s, %s \n", stud.getName(),stud.getSchoolName());	
        }
    }
}