package education.dao;

import education.entity.Action;
import education.entity.ActionType;
import education.entity.People;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class Main {

    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Main.class);
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();


    }
}
