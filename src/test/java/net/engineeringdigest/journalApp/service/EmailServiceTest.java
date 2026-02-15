package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {
    @Autowired
    private EmailService emailService;
    @Disabled
    @Test
    void testSendMail(){
        emailService.sendEmail("abhayraj620285@gmail.com",
                "Testing java Email Service",
                "Hi ! ap kaise ho");
    }
}
