/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdi4;

import java.util.List;

/**
 *
 * @author MRuser
 */
public class NIIT {
    private List<Emp> Elist;
    private List<Students> Slist;

    public NIIT() {
    }

    public NIIT(List<Emp> Elist, List<Students> Slist) {
        this.Elist = Elist;
        this.Slist = Slist;
    }

    public List<Emp> getElist() {
        return Elist;
    }

    public void setElist(List<Emp> Elist) {
        this.Elist = Elist;
    }

    public List<Students> getSlist() {
        return Slist;
    }

    public void setSlist(List<Students> Slist) {
        this.Slist = Slist;
    }


    
}
