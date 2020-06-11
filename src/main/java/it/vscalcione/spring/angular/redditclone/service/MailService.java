package it.vscalcione.spring.angular.redditclone.service;

import it.vscalcione.spring.angular.redditclone.exceptions.SpringRedditException;
import it.vscalcione.spring.angular.redditclone.model.NotificationEmail;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MailService {

    private final JavaMailSender mailSender;
    private final MailContentBuilder mailContentBuilder;

    public void sendMail(NotificationEmail notificationEmail){
        MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            mimeMessageHelper.setFrom("springboot.reddit@gmail.com");
            mimeMessageHelper.setTo(notificationEmail.getRecipent());
            mimeMessageHelper.setSubject(notificationEmail.getSubject());
            mimeMessageHelper.setText(mailContentBuilder.build(notificationEmail.getBody()));
        };

        try{
            mailSender.send(mimeMessagePreparator);
            log.info("Activation email sent!!");
        }catch(MailException e){
            throw new SpringRedditException("Exception occurred when sending email to " + notificationEmail.getRecipent());

        }
    }
}
