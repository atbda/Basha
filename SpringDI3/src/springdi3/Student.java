/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdi3;

/**
 *
 * @author MRuser
 */
class Student {
    private int sid;
    private String sname;
    private String courseName;

    public Student(int sid, String sname, String courseName) {
        this.sid = sid;
        this.sname = sname;
        this.courseName = courseName;
    }

    
    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", sname=" + sname + ", courseName=" + courseName + '}';
    }
    
    
    public void getInfo(){
        System.out.println("Student INFO: "+sid+"  "+sname+"  "+courseName);
    }
    
}
