package ChainOfResponsibility.DB;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DataBase {
    private final Map<String,String> users;
    private final Map<String,String> roles;

    public DataBase(){
        users = new HashMap<>();
        users.put("adminUsername", "adminPassword");
        users.put("userUsername", "userPassword");

        roles = new HashMap<>();
        roles.put("adminUsername", "admin");
        roles.put("userUsername", "user");
    }

    public boolean validUser(String userName, String password){
      return users.get(userName)!=null && Objects.equals(users.get(userName),password);
    }

    public String getRole(String userName){
        if(hasRole(userName)){
            return roles.get(userName);
        }
        return null;
    }

    public boolean hasRole(String userName){
        return roles.containsKey(userName);
    }
}
