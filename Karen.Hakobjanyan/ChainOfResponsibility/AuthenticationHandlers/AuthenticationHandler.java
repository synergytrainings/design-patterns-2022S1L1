package ChainOfResponsibility.AuthenticationHandlers;

import ChainOfResponsibility.DB.DataBase;
import ChainOfResponsibility.Model.User;

public class AuthenticationHandler extends Handler{
    private DataBase dataBase;

    public AuthenticationHandler(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public boolean handle(String userName, String password) {
        if(!dataBase.validUser(userName, password)){
            return false;
        }
        return handleNext(userName, password);
    }
}
