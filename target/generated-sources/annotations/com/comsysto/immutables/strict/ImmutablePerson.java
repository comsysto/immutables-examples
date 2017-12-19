package com.comsysto.immutables.strict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Person"})
public final class ImmutablePerson implements Person {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final String job;
  private final List<String> skills;

  private ImmutablePerson(
      String firstName,
      String lastName,
      int age,
      String job,
      List<String> skills) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.job = job;
    this.skills = skills;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @Override
  public String getLastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @Override
  public int getAge() {
    return age;
  }

  /**
   * @return The value of the {@code job} attribute
   */
  @Override
  public Optional<String> getJob() {
    return Optional.ofNullable(job);
  }

  /**
   * @return The value of the {@code skills} attribute
   */
  @Override
  public List<String> getSkills() {
    return skills;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withFirstName(String value) {
    if (this.firstName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "firstName");
    return new ImmutablePerson(newValue, this.lastName, this.age, this.job, this.skills);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withLastName(String value) {
    if (this.lastName.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "lastName");
    return new ImmutablePerson(this.firstName, newValue, this.age, this.job, this.skills);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getAge() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withAge(int value) {
    if (this.age == value) return this;
    return new ImmutablePerson(this.firstName, this.lastName, value, this.job, this.skills);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#getJob() job} attribute.
   * @param value The value for job
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withJob(String value) {
    String newValue = Objects.requireNonNull(value, "job");
    if (Objects.equals(this.job, newValue)) return this;
    return new ImmutablePerson(this.firstName, this.lastName, this.age, newValue, this.skills);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#getJob() job} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for job
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withJob(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.job, value)) return this;
    return new ImmutablePerson(this.firstName, this.lastName, this.age, value, this.skills);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Person#getSkills() skills}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withSkills(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutablePerson(this.firstName, this.lastName, this.age, this.job, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Person#getSkills() skills}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of skills elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withSkills(Iterable<String> elements) {
    if (this.skills == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutablePerson(this.firstName, this.lastName, this.age, this.job, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
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
    h += (h << 5) + Objects.hashCode(job);
    h += (h << 5) + skills.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Person{");
    builder.append("firstName=").append(firstName);
    builder.append(", ");
    builder.append("lastName=").append(lastName);
    builder.append(", ");
    builder.append("age=").append(age);
    if (job != null) {
      builder.append(", ");
      builder.append("job=").append(job);
    }
    builder.append(", ");
    builder.append("skills=").append(skills);
    return builder.append("}").toString();
  }

  /**
   * Creates an immutable copy of a {@link Person} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static ImmutablePerson copyOf(Person instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ImmutablePerson.builder()
        .firstName(instance.getFirstName())
        .lastName(instance.getLastName())
        .age(instance.getAge())
        .job(instance.getJob())
        .addAllSkills(instance.getSkills())
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson ImmutablePerson}.
   * @return A new ImmutablePerson builder
   */
  public static ImmutablePerson.Builder builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private static final long INIT_BIT_AGE = 0x4L;
    private static final long OPT_BIT_JOB = 0x1L;
    private long initBits = 0x7L;
    private long optBits;

    private String firstName;
    private String lastName;
    private int age;
    private String job;
    private List<String> skills = new ArrayList<String>();

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Person#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstName(String firstName) {
      checkNotIsSet(firstNameIsSet(), "firstName");
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastName(String lastName) {
      checkNotIsSet(lastNameIsSet(), "lastName");
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(int age) {
      checkNotIsSet(ageIsSet(), "age");
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#getJob() job} to job.
     * @param job The value for job
     * @return {@code this} builder for chained invocation
     */
    public final Builder job(String job) {
      checkNotIsSet(jobIsSet(), "job");
      this.job = Objects.requireNonNull(job, "job");
      optBits |= OPT_BIT_JOB;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#getJob() job} to job.
     * @param job The value for job
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder job(Optional<String> job) {
      checkNotIsSet(jobIsSet(), "job");
      this.job = job.orElse(null);
      optBits |= OPT_BIT_JOB;
      return this;
    }

    /**
     * Adds one element to {@link Person#getSkills() skills} list.
     * @param element A skills element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(String element) {
      this.skills.add(Objects.requireNonNull(element, "skills element"));
      return this;
    }

    /**
     * Adds elements to {@link Person#getSkills() skills} list.
     * @param elements An array of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSkills(String... elements) {
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }

    /**
     * Adds elements to {@link Person#getSkills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSkills(Iterable<String> elements) {
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      checkRequiredAttributes();
      return new ImmutablePerson(firstName, lastName, age, job, createUnmodifiableList(true, skills));
    }

    private boolean jobIsSet() {
      return (optBits & OPT_BIT_JOB) != 0;
    }

    private boolean firstNameIsSet() {
      return (initBits & INIT_BIT_FIRST_NAME) == 0;
    }

    private boolean lastNameIsSet() {
      return (initBits & INIT_BIT_LAST_NAME) == 0;
    }

    private boolean ageIsSet() {
      return (initBits & INIT_BIT_AGE) == 0;
    }

    private void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Person is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() throws IllegalStateException {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if (!firstNameIsSet()) attributes.add("firstName");
      if (!lastNameIsSet()) attributes.add("lastName");
      if (!ageIsSet()) attributes.add("age");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
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
