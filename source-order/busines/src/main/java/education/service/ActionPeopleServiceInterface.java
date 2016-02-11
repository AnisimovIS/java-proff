package education.service;

import education.entity.Action;
import education.entity.ActionType;
import education.entity.People;

import java.util.List;

public interface ActionPeopleServiceInterface {
    void create(People people, Action action);
    void remove(long id);
    void update(long id, People people, Action action);
    void delete(long id);
    People get(long id);
    List<Action> find(People people, Action action);
}
