package com.zendesk.ticket.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CredConfig {
    @Value("${api.username}")
    private String apiUsername;

    @Value("${api.password}")
    private String apiPassword;

    public String getApiUsername() {
        return apiUsername;
    }

    public String getApiPassword() {
        return apiPassword;
    }
}
