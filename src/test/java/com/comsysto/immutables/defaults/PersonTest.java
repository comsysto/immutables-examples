package com.comsysto.immutables.defaults;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
public class PersonTest {

    @Test
    public void testOptional() {
        Person person = ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .age(33)
                .build();

        assertThat(person.getJob()).isEqualTo("Software Developer");
    }      
}
