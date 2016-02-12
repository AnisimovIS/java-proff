package education.dao;

import org.hibernate.Session;

import java.io.Serializable;


public abstract class  commonDAO {
    public static final Session session = HibernateUtils.getSessionFactory().getCurrentSession();

    public Serializable create(Object entity){
        session.beginTransaction();
        Serializable result = session.save(entity);
        session.getTransaction().commit();
        return result;
    }

    public <T> T read(Class clazz, Serializable entityId) {
        session.beginTransaction();
        T entity = (T) session.get(clazz, entityId);
        session.getTransaction().commit();
        return entity;
    }

}
