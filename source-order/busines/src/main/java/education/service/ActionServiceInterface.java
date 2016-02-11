package education.service;

import education.entity.Action;
import education.entity.ActionType;
import education.entity.People;

import java.util.List;

/**
 * Created by Ilya on 11.02.2016.
 */
public interface ActionServiceInterface {
    void create(String name,long kal,ActionType type);
    void remove(long id);
    void update(long id, String name,long kal,ActionType type);
    void delete(long id);
    People get(long id);
    List<Action> find(String name,long kal,ActionType type);
}
