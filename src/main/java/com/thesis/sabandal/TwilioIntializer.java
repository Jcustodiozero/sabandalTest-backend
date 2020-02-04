package com.thesis.sabandal;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioIntializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioIntializer.class);

    private final  TwillioConfig twillioConfig;

    @Autowired
    public TwilioIntializer(TwillioConfig twillioConfig) {
        this.twillioConfig = twillioConfig;
        Twilio.init(
                twillioConfig.getAccountSid(),
                twillioConfig.getAuthToken()
        );
        LOGGER.info("Twilio initialized .... wtih accoutn sid {} ", twillioConfig.getAccountSid());
    }
}
