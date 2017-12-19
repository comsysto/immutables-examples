
package com.comsysto.immutables.factory;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
public class PointTest {

    @Test
    public void testFactory() {
        Point p = ImmutablePoint.of(10, 100);
        Assertions.assertThat(p.getX()).isEqualTo(10);
        Assertions.assertThat(p.getY()).isEqualTo(100);
    }
}
