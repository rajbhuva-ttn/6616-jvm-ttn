package com.ttn.RestFulWebService.Internationalization.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class I18nController {
    @Autowired
    MessageSource messageSource;

    public I18nController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/i18n")
    public String i18n(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default Message",locale);
    }

    @GetMapping(path = "/{userName}")
    public String helloUser(@PathVariable String userName){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("username.message", new String[]{userName.toUpperCase()},"Default Message",locale);

    }


}
