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
public class MethodsEx {
    void m1(){
    
        System.out.println("----m1() method-------------");
    }
    
    
    void m3(){
    m1();
        System.out.println("-------m3() method-------------");
    
    }
    static void m2(){
        MethodsEx m=new MethodsEx();
        m.m1();
        
    
    }
    
    
    void add(int a,int b){
    
        System.out.println(a+b);
    }
    
    int mult(int a,int b,int c){
    
    return a*b*c;
    }
    
    
    void saveStudent(Student s){
    
        System.out.println("Saving student "+s.getSname());
    }
    
    //ml rt mn()al
    public Student updateStudent(Student s){
    s.setSname("new Student");
    return s;
    }
    public static void main(String[] args) {
        MethodsEx m=new MethodsEx();
        m.m3();
        MethodsEx.m2();
        int mult = m.mult(10,22,2);
        System.out.println(mult);
        System.out.println(m.mult(22,2, 20)); 
        Student s1=new Student(123, "me ", "java");
        m.saveStudent(s1);
        
        Student updateStudent = m.updateStudent(s1);
        System.out.println(updateStudent.getSname());
        System.out.println(m.updateStudent(s1).getSname());
    }
    
}
