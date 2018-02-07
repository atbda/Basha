/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuein;

/**
 *
 * @author MRuser
 */
public class Employee {
   
    String EmpID;
    String EmpPosition;
    String EmpName;
    String EmpSalary;

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public void setEmpPosition(String EmpPosition) {
        this.EmpPosition = EmpPosition;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public void setEmpSalary(String EmpSalary) {
        this.EmpSalary = EmpSalary;
    }
     void  EmpInfo(){
        System.out.println("EmpId "+EmpID+"\nEmpPosition:"+EmpPosition+"\nEmpName:"+EmpName+"\nEmpSalary:"+EmpSalary);
    }
}
   
