/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
public class console implements MessageRender {
 MessageProvider MP;
 public void setMP(MessageProvider Mp) {
     this.MP=MessageProvider;
    
}
 public void render(){
     if(MP==null){
         System.out.println("no message");
     }
     else
     {System.out.println("Hello spring");
             
             }
 }
 
}
