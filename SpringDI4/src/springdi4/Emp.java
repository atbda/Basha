/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdi4;

/**
 *
 * @author MRuser
 */
class Emp {
   private int Eid;
    private String Ename;
    private int Mob;
    private String Address;

    public Emp() {
    }

    public Emp(int Eid, String Ename, int Mob, String Address) {
        this.Eid = Eid;
        this.Ename = Ename;
        this.Mob = Mob;
        this.Address = Address;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String Ename) {
        this.Ename = Ename;
    }

    public int getMob() {
        return Mob;
    }

    public void setMob(int Mob) {
        this.Mob = Mob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Emp{" + "Eid=" + Eid + ", Ename=" + Ename + ", Mob=" + Mob + ", Address=" + Address + '}';
    }
 public void getEInfo(){
        System.out.println("Emp INFO: "+Eid+"  "+Ename+"  "+Mob+"  " +Address);
    }
}
