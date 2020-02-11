/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Common;

import Business.Constants;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author praty
 */
public class SendEmail {
    
    public static void SendEmail(String to, String sub, String msg) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                //return new javax.mail.PasswordAuthentication(from, password);
                return new javax.mail.PasswordAuthentication(Constants.FromEmail, Constants.FromPassword);
            }
        });
        //compose message    
        try {
            MimeMessage message = new MimeMessage(session);
            //message.setFrom(new InternetAddress(from));
            message.setFrom(new InternetAddress(Constants.FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
           // message.setText(msg);
           message.setContent(msg, "text/html");
            //send message  
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com",Constants.FromEmail, Constants.FromPassword);
            transport.sendMessage(message, message.getAllRecipients());
            //javax.mail.Transport.send(message);
            transport.close();
            System.out.println("message sent successfully");
        } catch (javax.mail.MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    
}
