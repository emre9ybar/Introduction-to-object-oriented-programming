package newExample;

import javax.management.BadStringOperationException;

public class User extends Person{
    String userName;
    String password;
    //PARAMETRESİZ CONSTRACTER


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
