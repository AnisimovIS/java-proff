package education.service;

import education.entity.ActionType;
import education.entity.People;

import java.util.List;

/**
 * Created by Ilya on 11.02.2016.
 */
public interface PeopleServiceInterface {
    void create(String name);
    void remove(long id);
    void update(long id, String name);
    void delete(long id);
    People get(long id);
    List<People> find(String name);
}
