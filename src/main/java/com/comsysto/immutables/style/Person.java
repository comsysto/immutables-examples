package com.comsysto.immutables.style;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Style(
        add = "",
        depluralize = true
)
@Value.Immutable
public interface Person {
    
    String getFirstName();
    
    String getLastName();
    
    int getAge();
    
    Optional<String> getJob();
    
    List<String> getSkills();
}
