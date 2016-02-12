package education.entity;

import java.util.Date;

/**
 * Created by Ilya on 11.02.2016.
 */
public class Journal {
    private long id;
    private Date date;
    private ActionPeople actionPeople;

    public Journal(long id, Date date, ActionPeople actionPeople) {
        this.id = id;
        this.date = date;
        this.actionPeople = actionPeople;
    }

    public Journal() {
    }
}
