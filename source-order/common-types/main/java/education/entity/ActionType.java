package education.entity;

/**
 * Created by Ilya on 11.02.2016.
 */
public class ActionType {
    private long id;
    private String name;

    public ActionType(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
