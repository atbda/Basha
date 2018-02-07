/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueinjection;

/**
 *
 * @author MRuser
 */
public class JdbcUtil {
    String url;
    String password;
    String username;
    String driver;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    
    void  checkCon(){
        System.out.println("DRIVER: "+driver+"\n  URl:  "+url+"\n  PASSWORD:  "+password+"\n  USERNAME:  "+username);
    }
}
