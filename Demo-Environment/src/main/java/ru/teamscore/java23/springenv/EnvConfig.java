package ru.teamscore.java23.springenv;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySources({
    @PropertySource(value = "classpath:app.properties"),
    @PropertySource(value = "file:///home/anastasy/springenv.properties", encoding = "UTF-8")
})
public class EnvConfig {
}
