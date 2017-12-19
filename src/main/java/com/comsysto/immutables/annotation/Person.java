package com.comsysto.immutables.annotation;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andreas Eberhoefer <andreas.eberhoefer@comsysto.com>
 */
@MyValue
public interface Person  {

    String getFirstName();

    String getLastName();

    int getAge();

    Optional<String> getJob();

    List<String> getSkills();
}
