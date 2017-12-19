package com.comsysto.immutables.defaults;

import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {
    
    public abstract String getFirstName();
    
    public abstract String getLastName();
    
    public abstract int getAge();
    
    @Value.Default
    public String getJob() {
        return "Software Developer";
    }
    
    public abstract List<String> getSkills();
}
