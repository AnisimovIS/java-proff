package education.dao;

import education.entity.People;
import org.apache.log4j.spi.LoggerFactory;

import java.util.logging.Logger;

/**
 * Created by Ilya on 11.02.2016.
 */
public class PeopleDAO implements PeopleDAOInterface {
    private org.slf4j.Logger logger;
    public void create(People people) {
        session.beginTransaction();
        session.save(people);
        session.getTransaction().commit();
        logger.debug("Create people:" + people);
    }

    public void remove(People people) {

    }

    public void update(People people) {
        session.beginTransaction();
        session.saveOrUpdate(people);
        session.flush();
        session.getTransaction().commit();
        logger.debug("update people:" + people);
    }

    public void delete(People people) {
        session.beginTransaction();
        session.saveOrUpdate(people);
        session.flush();
        session.getTransaction().commit();
        logger.debug("delete people:" + people);
    }
}
