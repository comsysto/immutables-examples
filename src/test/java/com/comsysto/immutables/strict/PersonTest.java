package com.comsysto.immutables.strict;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.Test;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
public class PersonTest {

    @Test
    public void testMissingRequiredFied() {
        assertThatThrownBy(() -> ImmutablePerson.builder()
                .firstName("Andreas")
                .lastName("Eberhöfer")
                .lastName("Eberhöfer")
                .age(33)
                .build())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Builder of Person is strict, attribute is already set: lastName");
    }

    
}
