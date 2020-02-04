package com.thesis.sabandal;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {

    private static  final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);
    private  final TwillioConfig twillioConfig;

    @Autowired
    public TwilioSmsSender(TwillioConfig twillioConfig) {
        this.twillioConfig = twillioConfig;
    }


    @Override
    public void sendSms(SmsRequest smsRequest) {
        if (isPhoneNumberIsValid(smsRequest.getPhonenumber())){
            PhoneNumber to = new PhoneNumber(smsRequest.getPhonenumber());
            PhoneNumber from = new PhoneNumber(twillioConfig.getTrialNumber());
            String message = smsRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            LOGGER.info("Send sms {} " +smsRequest);
        }else{
            throw new IllegalArgumentException("Phone number ["+ smsRequest.getPhonenumber()+ "] is not valid");
        }
    }

    private boolean isPhoneNumberIsValid(String phonenumber) {
        return true;
    }
}
