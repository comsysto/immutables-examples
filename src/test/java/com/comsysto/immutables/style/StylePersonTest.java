package com.comsysto.immutables.style;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
public class StylePersonTest {

        @Test
    public void testEmptyList() {
        Person person = ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .age(33)
                .job("Software Developer")
                .skill("Java")
                .skill("JavaScript")
                .skill("Spring")
                .build();
        
        assertThat(person.getJob()).isPresent();
        assertThat(person.getSkills()).hasSize(3);
    }
}
