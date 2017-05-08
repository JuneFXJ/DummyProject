
import java.io.Serializable;

public class Admin implements Serializable{
    private static final long serialVersionUID = 748392348L;
    private String account;
    private String password;

    public String getAccount(){
    	return account;
    }
    public void setAccount(String newAccount){
    	this.account = newAccount;
    }

    public String getPassword(){
    	return password;
    }

    public void setPassword(String newPassword){
    	this.password = newPassword;
    }

}