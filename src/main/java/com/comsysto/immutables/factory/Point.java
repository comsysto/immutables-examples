
package com.comsysto.immutables.factory;

import org.immutables.value.Value;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
@Value.Immutable(builder = false)
public interface Point {

    @Value.Parameter
    public int getX();
    
    @Value.Parameter
    public int getY();    
}
