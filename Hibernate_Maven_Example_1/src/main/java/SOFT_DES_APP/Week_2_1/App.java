package SOFT_DES_APP.Week_2_1;

import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Session;
import Feb14Hib.entity.Student;
import Feb14Hib.utility.HibernateUtil;


public class App 
{
    public static void main( String[] args )
    {
    	Student student1 = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        Student student2 = new Student("John", "Cena", "john@javaguides.com");
        
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
            // start a transaction
            transaction = session.beginTransaction();
            
            // save the student objects
            session.save(student1);
            session.save(student2);
            
            // commit transaction
            transaction.commit();
       
        session = HibernateUtil.getSessionFactory().openSession();
            List < Student > students = session.createQuery("from Student", Student.class).list();
            
            for(Student astudent: students) {
            	System.out.println(astudent.getFirstName());
            	session.close();
        }
    }
}
