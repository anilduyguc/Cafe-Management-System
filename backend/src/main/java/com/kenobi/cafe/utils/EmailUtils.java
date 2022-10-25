package com.kenobi.cafe.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailUtils {
    private final JavaMailSender emailSender;
    public void sendSimpleMessage(String to, String subject, String text, List<String> list){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("anilduyguc3553@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        if(list!=null && list.size() > 0) message.setCc(this.getCcArray(list));
        emailSender.send(message);
    }
    private String[] getCcArray(List<String> ccList){
        String[] cc = new String[ccList.size()];
        for(int i=0; i<ccList.size(); i++){
            cc[i] = ccList.get(i);
        }
        return cc;
    }
    public void forgotMail(String to, String subject, String password) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom("anilduyguc3553@gmail.com");
        helper.setTo(to);
        helper.setSubject(subject);
        String htmlMessage = "<p><b>Your login details for Cafe Management System" +
                "</b><br><b>Email: </b> " + to + "<br><b>Password: </b> " + password + "<br>" +
                "<a href=\"http://localhost:4200/\"> Click here to login</a></p>";
        message.setContent(htmlMessage, "text/html");
        emailSender.send(message);
    }
}
