package ua.com.sourceit.secretsanta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стас on 19.01.14.
 */
public class AddUserCommand extends AbstractSecretSantaCommand {

    SecretSanta_Dao dao;
        AddUserCommand(SecretSanta_Dao dao){
            this.dao = dao;
    }


    public List<String> getInputDescriptions() {

        List<String> inputDesc = new ArrayList<String>();

        inputDesc.add("Введите имя человека");
        inputDesc.add("Введите имя группы");
        return inputDesc;
   }
    @Override
    public void executeCommand() {
        dao.createUser(inputList.get(0), inputList.get(1));
    }


}
