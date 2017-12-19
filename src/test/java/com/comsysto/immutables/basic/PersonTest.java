package com.comsysto.immutables.basic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
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

        assertThat(person.getJob()).isEmpty();
    }
    
    @Test
    public void testBuilderFrom() {
        Person person = ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .age(33)
                .build();

        Person newPerson = ImmutablePerson.builder()
                .from(person)
                .age(34)
                .build();
        
        assertThat(newPerson).isNotSameAs(person);
        assertThat(newPerson.getAge()).isEqualTo(34);
    }
    
    @Test
    public void testCreateNew() {
        ImmutablePerson person = ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .age(33)
                .build();

        ImmutablePerson newPerson = person.withAge(34);
        
        assertThat(newPerson).isNotSameAs(person);
        assertThat(newPerson.getAge()).isEqualTo(34);
    }

    @Test
    public void testMissingRequiredFied() {
        assertThatThrownBy(() -> ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .build())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Cannot build Person, some of required attributes are not set [age]");
    }

    @Test
    public void testEmptyList() {
        Person person = ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .age(33)
                .job("Software Developer")
                .addSkills("Java")
                .addSkills("JavaScript")
                .addSkills("Spring")
                .build();

        assertThat(person.getJob()).isPresent();
        assertThat(person.getSkills()).hasSize(3);
    }
}
