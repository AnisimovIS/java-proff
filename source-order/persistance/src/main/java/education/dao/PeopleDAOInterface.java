package education.dao;

import education.entity.People;

public interface PeopleDAOInterface extends commonDAO {
    void create (People people);
    void remove (People people);
    void update (People people);
    void delete (People people);
}
