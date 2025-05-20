package com.example.java5_asm.service.impl;

import com.example.java5_asm.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender javaMailSender;

    @Override
    public void sendMail(String to, String email, String subject) {
        try {
            MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, "UTF-8");

            mimeMessageHelper.setText(email, true);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setFrom("namboi", "namboi");
            javaMailSender.send(mimeMailMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String buildEmail(String email, String link) {
        return "<div style=\"text-align: center;\">\n" +
                "        <h2 style=\"color: #333;\">Kích hoạt tài khoản</h2>\n" +
                "        <p style=\"color: #555;\">Kích hoạt tài khoản:</p>\n" +
                "            <label for=\"email\" style=\"color: #444;\">Email:" + email + "</label><br>\n" +
                "            <a href=\"" + link + "\">" + "Active account</a>\n" +
                "    </div>";
    }
}