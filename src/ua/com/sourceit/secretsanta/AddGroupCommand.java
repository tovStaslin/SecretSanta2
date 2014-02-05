package ua.com.sourceit.secretsanta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стас on 19.01.14.
 */
public class AddGroupCommand extends AbstractSecretSantaCommand {

    SecretSanta_Dao dao;

    public AddGroupCommand(SecretSanta_Dao dao) {
        super();
    }

    @Override
    public List<String> getInputDescription(){
        List<String> inputDesc = new ArrayList<String>();
        inputDesc.add("Введите имя группы");
        return inputDesc;
    }

    public void executeCommand(){
        dao.createGroup(inputList.get(0));
    }
}
