package education.entity;

/**
 * Created by Ilya on 11.02.2016.
 */
public class ActionPeople {
    private long id;
    private People people;
    private Action action;

    public ActionPeople(long id, People people, Action action) {
        this.id = id;
        this.people = people;
        this.action = action;
    }

    public ActionPeople() {
    }

    public long getId() {
        return id;
    }

    public People getPeople() {
        return people;
    }

    public Action getAction() {
        return action;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
