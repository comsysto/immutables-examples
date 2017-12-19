package com.comsysto.immutables.hiding;

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
 * {@code new Person.Builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Person"})
final class ImmutablePerson implements Person {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final String job;
  private final List<Person> children;

  private ImmutablePerson(
      String firstName,
      String lastName,
      int age,
      String job,
      List<Person> children) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.job = job;
    this.children = children;
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
   * @return The value of the {@code children} attribute
   */
  @Override
  public List<Person> getChildren() {
    return children;
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
    return new ImmutablePerson(newValue, this.lastName, this.age, this.job, this.children);
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
    return new ImmutablePerson(this.firstName, newValue, this.age, this.job, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getAge() age} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withAge(int value) {
    if (this.age == value) return this;
    return new ImmutablePerson(this.firstName, this.lastName, value, this.job, this.children);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#getJob() job} attribute.
   * @param value The value for job
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withJob(String value) {
    String newValue = Objects.requireNonNull(value, "job");
    if (Objects.equals(this.job, newValue)) return this;
    return new ImmutablePerson(this.firstName, this.lastName, this.age, newValue, this.children);
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
    return new ImmutablePerson(this.firstName, this.lastName, this.age, value, this.children);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Person#getChildren() children}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withChildren(Person... elements) {
    List<Person> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutablePerson(this.firstName, this.lastName, this.age, this.job, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Person#getChildren() children}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of children elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withChildren(Iterable<? extends Person> elements) {
    if (this.children == elements) return this;
    List<Person> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
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
        && children.equals(another.children);
  }

  /**
   * Computes a hash code from attributes: {@code firstName}, {@code lastName}, {@code age}, {@code job}, {@code children}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + age;
    h += (h << 5) + Objects.hashCode(job);
    h += (h << 5) + children.hashCode();
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
    builder.append("children=").append(children);
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
    return new Person.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private static final long INIT_BIT_AGE = 0x4L;
    private long initBits = 0x7L;

    private String firstName;
    private String lastName;
    private int age;
    private String job;
    private List<Person> children = new ArrayList<Person>();

    /**
     * Creates a builder for {@link ImmutablePerson ImmutablePerson} instances.
     */
    public Builder() {
      if (!(this instanceof Person.Builder)) {
        throw new UnsupportedOperationException("Use: new Person.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder from(Person instance) {
      Objects.requireNonNull(instance, "instance");
      firstName(instance.getFirstName());
      lastName(instance.getLastName());
      age(instance.getAge());
      Optional<String> jobOptional = instance.getJob();
      if (jobOptional.isPresent()) {
        job(jobOptional);
      }
      addAllChildren(instance.getChildren());
      return (Person.Builder) this;
    }

    /**
     * Initializes the value for the {@link Person#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return (Person.Builder) this;
    }

    /**
     * Initializes the value for the {@link Person#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return (Person.Builder) this;
    }

    /**
     * Initializes the value for the {@link Person#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder age(int age) {
      this.age = age;
      initBits &= ~INIT_BIT_AGE;
      return (Person.Builder) this;
    }

    /**
     * Initializes the optional value {@link Person#getJob() job} to job.
     * @param job The value for job
     * @return {@code this} builder for chained invocation
     */
    public final Person.Builder job(String job) {
      this.job = Objects.requireNonNull(job, "job");
      return (Person.Builder) this;
    }

    /**
     * Initializes the optional value {@link Person#getJob() job} to job.
     * @param job The value for job
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder job(Optional<String> job) {
      this.job = job.orElse(null);
      return (Person.Builder) this;
    }

    /**
     * Adds one element to {@link Person#getChildren() children} list.
     * @param element A children element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder addChildren(Person element) {
      this.children.add(Objects.requireNonNull(element, "children element"));
      return (Person.Builder) this;
    }

    /**
     * Adds elements to {@link Person#getChildren() children} list.
     * @param elements An array of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder addChildren(Person... elements) {
      for (Person element : elements) {
        this.children.add(Objects.requireNonNull(element, "children element"));
      }
      return (Person.Builder) this;
    }

    /**
     * Sets or replaces all elements for {@link Person#getChildren() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder children(Iterable<? extends Person> elements) {
      this.children.clear();
      return addAllChildren(elements);
    }

    /**
     * Adds elements to {@link Person#getChildren() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Person.Builder addAllChildren(Iterable<? extends Person> elements) {
      for (Person element : elements) {
        this.children.add(Objects.requireNonNull(element, "children element"));
      }
      return (Person.Builder) this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson(firstName, lastName, age, job, createUnmodifiableList(true, children));
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
