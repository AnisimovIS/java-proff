package education.entity;

/**
 * Created by Ilya on 11.02.2016.
 */
public class Action{
    private long id;
    private long kal;
    private String name;
    private education.entity.ActionType type;

    public Action() {
    }

    public Action(long kal, String name, ActionType type) {
        this.kal = kal;
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public long getKal() {
        return kal;
    }

    public String getName() {
        return name;
    }

    public ActionType getType() {
        return type;
    }

    public void setKal(long kal) {
        this.kal = kal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ActionType type) {
        this.type = type;
    }
}
