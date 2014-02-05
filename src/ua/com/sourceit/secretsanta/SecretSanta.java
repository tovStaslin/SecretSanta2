package ua.com.sourceit.secretsanta;

/**
 * Created by Стас on 19.01.14.
 */
public class SecretSanta {
    SecretSanta_Dao dao;

    public SecretSanta(){
        this.dao = new SecretSanta_Dao();
    }

    public SecretSante_Comand_Interface createCommand(String input){
        final int menuItem;
        try{
            menuItem = Integer.parseInt(input);
        }catch (NumberFormatException nfe){
            throw  new IllegalArgumentException("Введите цифру");
        }
        switch (menuItem) {
            case 0:
                return new ExitCommand();
            case 1:
                return new AddGroupCommand(dao);
            case 2:
                return new AddUserCommand(dao);
            // etc
            default:
                throw new IllegalArgumentException("не существует варианта:  " + menuItem);
        }

    }

    public String getMenu() {
        String s = "0. Exit \n" +
                "1. Add group \n" +
                "2. Add user";
        return s;

    }
}
