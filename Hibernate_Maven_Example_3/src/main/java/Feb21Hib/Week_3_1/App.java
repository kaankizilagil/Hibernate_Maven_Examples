package Feb21Hib.Week_3_1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Feb21Hib.Entity.BlogPost;
import Feb21Hib.Entity.Book;
import Feb21Hib.Util.HibernateUtil;


public class App 
{
    public static void main( String[] args )
    {
    	BlogPost bp1 = new BlogPost("Blog Post First", "https://twitter.com/?lang=tr");
    	Book book1 = new Book("Hell",489);
    	Book book2 = new Book("DaVincisSecret",512);
    	Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        // start a transaction
        transaction = (Transaction) session.beginTransaction();
            
        // save the book objects
        session.save(book1);
        session.save(book2);
        session.save(bp1);
            
        // commit transaction
        transaction.commit();
       
        session = HibernateUtil.getSessionFactory().openSession();
        List < Book > books = session.createQuery("from Book", Book.class).list();
            
        for(Book aBook: books) 
        	System.out.println(aBook.getTitle());
        session.close();
    }
}
