package com.comsysto.immutables.check;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {
    
    public abstract String getFirstName();
    
    public abstract String getLastName();
    
    public abstract int getAge();
    
    public abstract Optional<String> getJob();
    
    public abstract List<String> getSkills();
    
    @Value.Check
    protected void checkSkills() {
        if(getSkills().isEmpty()) {
            throw new IllegalStateException("At least one skill is required");
        }
    }
}
