package email;

import java.util.Properties;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

    public static boolean send(String to, String subject, String msg) {
        try {

            String userid = "";
            String password = "";

            Properties properties = new Properties();

            properties.put("mail.smtp.auth", true);
            properties.put("mail.smtp.starttls.enable", true);
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.host", "smtp.gmail.com");

            Session session = Session.getInstance(properties, new Authenticator() {

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication(userid, password);
                }
            });

            Message message = new MimeMessage(session);

            message.addRecipient(RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            return false;
        }

    }
    

}
