package education.dao;

import education.entity.People;
import org.hibernate.Session;

/**
 * Created by Ilya on 11.02.2016.
 */
public class Main {

    public static void main(String[] args){
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        PeopleDAO peopleDAO =  new PeopleDAO();
        session.beginTransaction();
        People people = new People();
        peopleDAO.create(people);
    }
}
