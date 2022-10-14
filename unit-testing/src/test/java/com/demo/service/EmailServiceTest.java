package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @InjectMocks
    EmailService emailService;

    @Mock
    Order order;
    @Test(expected = RuntimeException.class)
    public void testSendEmailFalse(){
        emailService.sendEmail(order);
        doThrow(RuntimeException.class).when(order).setCustomerNotified(false);
    }

    @Test
    public void testSendEmailTrue(){

        boolean result = emailService.sendEmail(order, "Send email to Raj");

        verify(order, times(1)).setCustomerNotified(true);
        assertTrue(result);
    }

}