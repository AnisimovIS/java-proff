package education.service;

import education.entity.ActionPeople;
import education.entity.ActionType;
import education.entity.Journal;

import java.util.Date;
import java.util.List;

/**
 * Created by Ilya on 11.02.2016.
 */
public interface JournalServiceInterface {
    void createActionType(Date date,ActionPeople actionPeople);
    void removeActionType(long id);
    void updateActionType(long id, Date date,ActionPeople actionPeople);
    void deleteActionType(long id);
    ActionType getActionType(long id);
    List<Journal> find(Date date,ActionPeople actionPeople);
}
