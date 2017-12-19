package com.comsysto.immutables.hiding;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE)
@Value.Immutable
public interface Person {
    
    String getFirstName();
    
    String getLastName();
    
    int getAge();
    
    Optional<String> getJob();
    
    List<Person> getChildren();
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder extends ImmutablePerson.Builder {
        
    }
}
