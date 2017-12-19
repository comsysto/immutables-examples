package com.comsysto.immutables.mutable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A modifiable implementation of the {@link Person Person} type.
 * <p>Use the {@link #create()} static factory methods to create new instances.
 * <p><em>ModifiablePerson is not thread-safe</em>
 */
@SuppressWarnings({"all"})
@Generated({"Modifiables.generator", "Person"})
public final class ModifiablePerson implements Person {
  private static final long INIT_BIT_FIRST_NAME = 0x1L;
  private static final long INIT_BIT_LAST_NAME = 0x2L;
  private static final long INIT_BIT_AGE = 0x4L;
  private long initBits = 0x7L;

  private String firstName;
  private String lastName;
  private int age;
  private Optional<String> job = Optional.empty();
  private final ArrayList<String> skills = new ArrayList<String>();

  private ModifiablePerson() {}

  /**
   * Construct a modifiable instance of {@code Person}.
   * @return A new modifiable instance
   */
  public static ModifiablePerson create() {
    return new ModifiablePerson();
  }

  /**
   * @return value of {@code firstName} attribute
   */
  @Override
  public final String getFirstName() {
    if (!firstNameIsSet()) {
      checkRequiredAttributes();
    }
    return firstName;
  }

  /**
   * @return value of {@code lastName} attribute
   */
  @Override
  public final String getLastName() {
    if (!lastNameIsSet()) {
      checkRequiredAttributes();
    }
    return lastName;
  }

  /**
   * @return value of {@code age} attribute
   */
  @Override
  public final int getAge() {
    if (!ageIsSet()) {
      checkRequiredAttributes();
    }
    return age;
  }

  /**
   * @return value of {@code job} attribute
   */
  @Override
  public final Optional<String> getJob() {
    return job;
  }

  /**
   * @return modifiable list {@code skills}
   */
  @Override
  public final List<String> getSkills() {
    return skills;
  }

  /**
   * Clears the object by setting all attributes to their initial values.
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson clear() {
    initBits = 0x7L;
    firstName = null;
    lastName = null;
    age = 0;
    job = Optional.empty();
    skills.clear();
    return this;
  }

  /**
   * Fill this modifiable instance with attribute values from the provided {@link Person} instance.
   * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
   * Any of the instance's absent optional values will not be copied (will not override current values).
   * Collection elements and entries will be added, not replaced.
   * @param instance The instance from which to copy values
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson from(Person instance) {
    Objects.requireNonNull(instance, "instance");
    setFirstName(instance.getFirstName());
    setLastName(instance.getLastName());
    setAge(instance.getAge());
    Optional<String> jobOptional = instance.getJob();
    if (jobOptional.isPresent()) {
      setJob(jobOptional);
    }
    addAllSkills(instance.getSkills());
    return this;
  }

  /**
   * Assigns a value to the {@code firstName} attribute.
   * @param firstName The value for firstName
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson setFirstName(String firstName) {
    this.firstName = Objects.requireNonNull(firstName, "firstName");
    initBits &= ~INIT_BIT_FIRST_NAME;
    return this;
  }

  /**
   * Assigns a value to the {@code lastName} attribute.
   * @param lastName The value for lastName
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson setLastName(String lastName) {
    this.lastName = Objects.requireNonNull(lastName, "lastName");
    initBits &= ~INIT_BIT_LAST_NAME;
    return this;
  }

  /**
   * Assigns a value to the {@code age} attribute.
   * @param age The value for age
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson setAge(int age) {
    this.age = age;
    initBits &= ~INIT_BIT_AGE;
    return this;
  }

  /**
   * Assigns a <i>present</i> value for the optional {@code job} attribute.
   * @param job A value for job
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson setJob(String job) {
    this.job = Optional.of(job);
    return this;
  }

  /**
   * Assigns an optional value for {@code job}.
   * @param job A value for job
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson setJob(Optional<String> job) {
    this.job = Objects.requireNonNull(job, "job");
    return this;
  }

  /**
   * Adds one element to {@code skills} list.
   * @param element The skills element
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson addSkills(String element) {
    String nonNullElement = Objects.requireNonNull(element, "skills element");
    skills.add(nonNullElement);
    return this;
  }

  /**
   * Adds elements to {@code skills} list.
   * @param elements An array of skills elements
   * @return {@code this} for use in a chained invocation
   */
  public final ModifiablePerson addSkills(String... elements) {
    for (String element : elements) {
      addSkills(Objects.requireNonNull(element, "skills element"));
    }
    return this;
  }

  /**
   * Sets or replaces all elements for {@code skills} list.
   * @param elements An iterable of skills elements
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson setSkills(Iterable<String> elements) {
    skills.clear();
    addAllSkills(elements);
    return this;
  }

  /**
   * Adds elements to {@code skills} list.
   * @param elements An iterable of skills elements
   * @return {@code this} for use in a chained invocation
   */
  public ModifiablePerson addAllSkills(Iterable<String> elements) {
    for (String element : elements) {
      addSkills(element);
    }
    return this;
  }

  /**
   * Returns {@code true} if the required attribute {@code firstName} is set.
   * @return {@code true} if set
   */
  public final boolean firstNameIsSet() {
    return (initBits & INIT_BIT_FIRST_NAME) == 0;
  }

  /**
   * Returns {@code true} if the required attribute {@code lastName} is set.
   * @return {@code true} if set
   */
  public final boolean lastNameIsSet() {
    return (initBits & INIT_BIT_LAST_NAME) == 0;
  }

  /**
   * Returns {@code true} if the required attribute {@code age} is set.
   * @return {@code true} if set
   */
  public final boolean ageIsSet() {
    return (initBits & INIT_BIT_AGE) == 0;
  }


  /**
   * Reset an attribute to its initial value.
   * @return {@code this} for use in a chained invocation
   */
  public final ModifiablePerson unsetFirstName() {
    initBits |= INIT_BIT_FIRST_NAME;
    firstName = null;
    return this;
  }

  /**
   * Reset an attribute to its initial value.
   * @return {@code this} for use in a chained invocation
   */
  public final ModifiablePerson unsetLastName() {
    initBits |= INIT_BIT_LAST_NAME;
    lastName = null;
    return this;
  }

  /**
   * Reset an attribute to its initial value.
   * @return {@code this} for use in a chained invocation
   */
  public final ModifiablePerson unsetAge() {
    initBits |= INIT_BIT_AGE;
    age = 0;
    return this;
  }

  /**
   * Returns {@code true} if all required attributes are set, indicating that the object is initialized.
   * @return {@code true} if set
   */
  public final boolean isInitialized() {
    return initBits == 0;
  }

  private void checkRequiredAttributes() {
    if (!isInitialized()) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = new ArrayList<String>();
    if (!firstNameIsSet()) attributes.add("firstName");
    if (!lastNameIsSet()) attributes.add("lastName");
    if (!ageIsSet()) attributes.add("age");
    return "Person in not initialized, some of the required attributes are not set " + attributes;
  }

  /**
   * This instance is equal to all instances of {@code ModifiablePerson} that have equal attribute values.
   * An uninitialized instance is equal only to itself.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    if (!(another instanceof ModifiablePerson)) return false;
    ModifiablePerson other = (ModifiablePerson) another;
    if (!isInitialized() || !other.isInitialized()) {
      return false;
    }
    return equalTo(other);
  }

  private boolean equalTo(ModifiablePerson another) {
    return firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && age == another.age
        && Objects.equals(job, another.job)
        && skills.equals(another.skills);
  }

  /**
   * Computes a hash code from attributes: {@code firstName}, {@code lastName}, {@code age}, {@code job}, {@code skills}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + age;
    h += (h << 5) + job.hashCode();
    h += (h << 5) + skills.hashCode();
    return h;
  }

  /**
   * Generates a string representation of this {@code Person}.
   * If uninitialized, some attribute values may appear as question marks.
   * @return A string representation
   */
  @Override
  public String toString() {
    return "ModifiablePerson{"
        + "firstName="  + (firstNameIsSet() ? getFirstName() : "?")
        + ", lastName="  + (lastNameIsSet() ? getLastName() : "?")
        + ", age="  + (ageIsSet() ? getAge() : "?")
        + ", job=" + getJob()
        + ", skills=" + getSkills()
        + "}";
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
