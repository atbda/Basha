/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
public class EmpService {
    EmailService emailService;

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
    
    void reg(){
        System.out.println("register....");
        emailService.sendEmail();
    
    
    }
    
    
}
