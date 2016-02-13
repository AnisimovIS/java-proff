package education.service;

import education.entity.ActionType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ilya on 11.02.2016.
 */
public interface ActionTypeServiceInterface {
    void createActionType(String name);
    void removeActionType(long id);
    void updateActionType(long id,String name);
    void deleteActionType(long id);
    ActionType getActionType(long id);
}
