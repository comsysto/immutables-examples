package com.comsysto.immutables.mutable;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
@Value.Modifiable
public interface Person {

    String getFirstName();

    String getLastName();

    int getAge();

    Optional<String> getJob();

    List<String> getSkills();
}
