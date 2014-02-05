package ua.com.sourceit.secretsanta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стас on 19.01.14.
 */
public class AbstractSecretSantaCommand implements  SecretSante_Comand_Interface {

    protected List<String> inputList = new ArrayList<String>();

    @Override
    public boolean isExit() {
        return false;
    }



    @Override
    public void addInput(String s) {
         inputList.add(s);
    }

    @Override
    public void executeCommand() {

    }

    @Override
    public String getSuccessDescription() {
        return "Success";
    }


    @Override
    public List<String> getInputDescription() {
        return null;
    }

}

class ExitCommand extends AbstractSecretSantaCommand {
    @Override
    public boolean isExit() {
        return true;
    }


    public List<String> getInputDescriptions() {
        return null;
    }

    @Override
    public void executeCommand() {
    }
}