/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdi3;

import java.util.List;

/**
 *
 * @author MRuser
 */
public class NIITPortal {
private    List<Student> slist;
    private int centreCode;
    private String centreName;

    public List<Student> getSlist() {
        return slist;
    }

    public void setSlist(List<Student> slist) {
        this.slist = slist;
    }

    public int getCentreCode() {
        return centreCode;
    }

    public void setCentreCode(int centreCode) {
        this.centreCode = centreCode;
    }

    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }
    
    
    
    
}
