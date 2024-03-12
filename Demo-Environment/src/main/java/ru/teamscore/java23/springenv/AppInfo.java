package ru.teamscore.java23.springenv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class AppInfo {
    @Value("${app.title}")
    private String title;
    @Value("${VERSION}")
    private String version;

    @Value("${web.baseurl}")
    private String baseUrl;

    @Value("${web.apipath}")
    private String apiPath;

    private String getApiUrl() {
        return URI.create(baseUrl)
                .resolve(apiPath)
                .toString();
    }

    @Override
    public String toString() {
        return "AppInfo: " +
                title + ", v. " + version +
                "\n\tapiUrl=" + getApiUrl();
    }
}
