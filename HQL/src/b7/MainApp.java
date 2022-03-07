package b7;

import org.hibernate.Session;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session objsession=HibernateDBConnect.getSessionFactory().openSession();
		
		try 
		{
			objsession.beginTransaction();
			
			objsession.createQuery("delete users where firstname='navya' ").executeUpdate();
			
		} 
		finally
		{
			objsession.close();
			
		}
	}
}