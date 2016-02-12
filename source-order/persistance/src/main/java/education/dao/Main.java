package education.dao;

import education.entity.Action;
import education.entity.ActionType;
import education.entity.People;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by Ilya on 11.02.2016.
 */
public class Main {

    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Main.class);
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        ActionDAO dao = new ActionDAO();

        ActionType type = new ActionType();
        type.setName("Еда");
        Serializable serType = dao.create(type);

        Action action = new Action();
        action.setName("Булка");
        action.setEnergy(1200L);
        action.setType(type);



    }
}
