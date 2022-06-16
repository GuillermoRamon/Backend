package com.example.BS4.clase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties()
public class Variables {

    @Value("${VAR1}")
    private String var1;
    @Value("${My.VAR2}")
    private String var2;
    @Value("${VAR3:no tiene valor}")
    private String var3;
}
