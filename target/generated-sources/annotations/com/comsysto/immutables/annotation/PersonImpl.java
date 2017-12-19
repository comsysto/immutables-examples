package com.comsysto.immutables.annotation;

import java.util.ArrayList;
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
 * {@code PersonImpl.newBuilder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Person"})
public final class PersonImpl implements Person {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final String job;
  private final List<String> skills;

  private PersonImpl(PersonImpl.Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.job = builder.job;
    this.skills = createUnmodifiableList(true, builder.skills);
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
   * This instance is equal to all instances of {@code PersonImpl} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof PersonImpl
        && equalTo((PersonImpl) another);
  }

  private boolean equalTo(PersonImpl another) {
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
   * Creates a builder for {@link PersonImpl PersonImpl}.
   * @return A new PersonImpl builder
   */
  public static PersonImpl.Builder newBuilder() {
    return new PersonImpl.Builder();
  }

  /**
   * Builds instances of type {@link PersonImpl PersonImpl}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  static final class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private static final long INIT_BIT_AGE = 0x4L;
    private long initBits = 0x7L;

    private String firstName;
    private String lastName;
    private int age;
    private String job;
    private List<String> skills = new ArrayList<String>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person instance) {
      Objects.requireNonNull(instance, "instance");
      firstName(instance.getFirstName());
      lastName(instance.getLastName());
      age(instance.getAge());
      Optional<String> jobOptional = instance.getJob();
      if (jobOptional.isPresent()) {
        job(jobOptional);
      }
      addAllSkills(instance.getSkills());
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstName(String firstName) {
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
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#getJob() job} to job.
     * @param job The value for job, {@code null} is accepted as {@code java.util.Optional.empty()}
     * @return {@code this} builder for chained invocation
     */
    public final Builder job(String job) {
      this.job = job;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#getJob() job} to job.
     * @param job The value for job
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder job(Optional<String> job) {
      this.job = job.orElse(null);
      return this;
    }

    /**
     * Adds one element to {@link Person#getSkills() skills} list.
     * @param element A skills element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder skill(String element) {
      this.skills.add(Objects.requireNonNull(element, "skills element"));
      return this;
    }

    /**
     * Adds elements to {@link Person#getSkills() skills} list.
     * @param elements An array of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder skill(String... elements) {
      for (String element : elements) {
        this.skills.add(Objects.requireNonNull(element, "skills element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Person#getSkills() skills} list.
     * @param elements An iterable of skills elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder skills(Iterable<String> elements) {
      this.skills.clear();
      return addAllSkills(elements);
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
     * Builds a new {@link PersonImpl PersonImpl}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PersonImpl build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new PersonImpl(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
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
