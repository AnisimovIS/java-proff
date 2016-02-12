package education.dao;

import education.entity.ActionType;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ilya on 12.02.2016.
 */
public class DAOtest {

    @Test
    public void testCreate() throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        ActionType actionType = new ActionType();

    }
}