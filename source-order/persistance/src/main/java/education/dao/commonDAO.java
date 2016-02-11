package education.dao;

import org.hibernate.Session;


public interface commonDAO {
    Session session = HibernateUtils.getSessionFactory().getCurrentSession();
}
