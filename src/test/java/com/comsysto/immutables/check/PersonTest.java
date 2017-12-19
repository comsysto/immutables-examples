package com.comsysto.immutables.check;

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
                .age(33)
                .build())
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("At least one skill is required");
    }

    
}
