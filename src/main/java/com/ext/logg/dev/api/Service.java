package com.ext.logg.dev.api;

import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public interface Service {
    List<Class<? extends Service>> SERVICE_CLASSES = getSubtypes(Service.class);
    List<String> SERVICE_NAMES = SERVICE_CLASSES.stream().map(c -> c.getSimpleName().toLowerCase())
            .collect(Collectors.toList());
    static <T> List<Class<? extends T>> getSubtypes(Class<T> clazz) {
        Reflections reflections = new Reflections(
                new ConfigurationBuilder().setUrls(Arrays.asList(ClasspathHelper.forClass(clazz))));
        Set<Class<? extends T>> subs = reflections.getSubTypesOf(clazz);
        return subs.stream().filter(c -> c.isInterface()) // only interested in interfaces
                .filter(c -> Arrays.asList(c.getInterfaces()).contains(clazz)) // and direct sub-interfaces
                .collect(Collectors.toList());
    }
}
