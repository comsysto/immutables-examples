package com.comsysto.immutables.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.immutables.value.Value;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
@Value.Style(
        builder = "newBuilder",
        add = "",
        builderVisibility = Value.Style.BuilderVisibility.PACKAGE,
        depluralize = true,
        optionalAcceptNullable = true,
        typeImmutable = "*Impl",
        defaults = @Value.Immutable(copy = false)
)

@Target(ElementType.TYPE)
public @interface MyValue {

}
