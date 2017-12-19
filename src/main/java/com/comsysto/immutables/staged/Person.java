package com.comsysto.immutables.staged;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Style(stagedBuilder = true)
@Value.Immutable(copy = false)
public interface Person {
    
    String getFirstName();
    
    String getLastName();
    
    int getAge();
    
    Optional<String> getJob();
    
    List<String> getSkills();
}
