package br.com.bruno.dio.spring_boot_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NONE}")
    private String dbEnvironment;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/env")
    public String getDbEnvironment() {
        return "The following environment variables are set: " + dbEnvironment;
    }
}
