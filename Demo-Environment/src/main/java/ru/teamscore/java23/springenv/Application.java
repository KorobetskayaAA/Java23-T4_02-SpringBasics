package ru.teamscore.java23.springenv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                EnvConfig.class
        );
        Environment env = context.getEnvironment();
        String author = env.getProperty("app.author");
        System.out.println(author);

        AppInfo info = context.getBean(AppInfo.class);
        System.out.println(info);
    }
}
