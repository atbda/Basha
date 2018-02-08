package springdi2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
class Student {
    private int Sid;
    private String Sname;
    private String Course;
    private String Address;
Student(){}
    public Student(int Sid, String Sname, String Course, String Address) {
        this.Sid = Sid;
        this.Sname = Sname;
        this.Course = Course;
        this.Address = Address;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int Sid) {
        this.Sid = Sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Student{" + "Sid=" + Sid + ", Sname=" + Sname + ", Course=" + Course + ", Address=" + Address + '}';
    }
   public void getInfo(){
        System.out.println("Student INFO: "+Sid+"  "+Sname+"  "+Course);
    }

}
