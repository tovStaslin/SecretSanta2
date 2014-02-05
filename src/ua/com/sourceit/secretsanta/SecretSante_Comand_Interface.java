package ua.com.sourceit.secretsanta;

import java.util.List;

/**
 * Created by Стас on 19.01.14.
 */
public interface SecretSante_Comand_Interface {
    boolean isExit();

    List<String> getInputDescription();

    void addInput(String s);

    void executeCommand();

    String getSuccessDescription();
}
