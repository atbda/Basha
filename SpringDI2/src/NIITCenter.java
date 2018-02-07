
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
public class NIITCenter {
 private    List<NiiT> Nlist;
private List<Student> Slist;

    public NIITCenter(List<NiiT> Nlist, List<Student> Slist) {
        this.Nlist = Nlist;
        this.Slist = Slist;
    }

    public List<NiiT> getNlist() {
        return Nlist;
    }

    public void setNlist(List<NiiT> Nlist) {
        this.Nlist = Nlist;
    }

    public List<Student> getSlist() {
        return Slist;
    }

    public void setSlist(List<Student> Slist) {
        this.Slist = Slist;
    }

 
    
}
