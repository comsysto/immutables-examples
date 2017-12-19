
package com.comsysto.immutables.mutable;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
public class MutablePersonTest {

        
    @Test
    public void testMutable() {
        ModifiablePerson person = ModifiablePerson.create()                
                .setFirstName("Andreas")
                .setLastName("Eberhöfer")
                .setAge(33);
                

        assertThat(person.getAge()).isEqualTo(33);  
        
        person.setAge(34);       
        assertThat(person.getAge()).isEqualTo(34);
    }    
        
}
