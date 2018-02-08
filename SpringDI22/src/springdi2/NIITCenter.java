package springdi2;


import java.util.List;


public class NIITCenter {
 private    List<NiiT> Nlist;
private List<Student> Slist;

    public NIITCenter() {
    }

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

    String setNlist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
