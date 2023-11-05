package com.ext.logg.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.util.stream.Collectors;

@SpringBootApplication
public class LoggingApplication {
    private static Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(String[] args) {
        try {
            String filePath = findPropertyFile();

            logger.info("Spring boot project has started: "+filePath);
            //SpringApplication.run(LoggingApplication.class, args);
            new SpringApplicationBuilder(LoggingApplication.class).properties("spring.config.location=" + filePath).build()
                    .run(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String findPropertyFile() throws IOException {
        return Files.walk(new File("config").toPath(), FileVisitOption.FOLLOW_LINKS)
                .filter(p -> p.toString().endsWith(".yml"))
                .map(p -> p.toFile().toString()) // relative path to file
                .collect(Collectors.joining(","));
    }

}
