package dev.ckateptb.minecraft.jyraf.container.annotation;

import dev.ckateptb.minecraft.jyraf.container.Container;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Component {
    String value() default Container.DEFAULT_QUALIFIER;
}
