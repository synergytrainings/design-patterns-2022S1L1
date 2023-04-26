package ChainOfResponsibility.AuthenticationHandlers;

import ChainOfResponsibility.DB.DataBase;
import ChainOfResponsibility.Model.User;

public class RoleHandler extends Handler{
    private DataBase dataBase;

    public RoleHandler(DataBase dataBase){
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String userName, String password) {
        if(dataBase.hasRole(userName)){
            dataBase.getRole(userName);
        }
        return handleNext(userName, password);
    }
}
