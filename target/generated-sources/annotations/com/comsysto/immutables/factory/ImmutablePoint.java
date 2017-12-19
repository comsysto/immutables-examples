package com.comsysto.immutables.factory;

import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Point}.
 * <p>
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePoint.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Point"})
public final class ImmutablePoint implements Point {
  private final int x;
  private final int y;

  private ImmutablePoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * @return The value of the {@code x} attribute
   */
  @Override
  public int getX() {
    return x;
  }

  /**
   * @return The value of the {@code y} attribute
   */
  @Override
  public int getY() {
    return y;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Point#getX() x} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for x
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePoint withX(int value) {
    if (this.x == value) return this;
    return new ImmutablePoint(value, this.y);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Point#getY() y} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for y
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePoint withY(int value) {
    if (this.y == value) return this;
    return new ImmutablePoint(this.x, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePoint
        && equalTo((ImmutablePoint) another);
  }

  private boolean equalTo(ImmutablePoint another) {
    return x == another.x
        && y == another.y;
  }

  /**
   * Computes a hash code from attributes: {@code x}, {@code y}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + x;
    h += (h << 5) + y;
    return h;
  }

  /**
   * Prints the immutable value {@code Point} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Point{"
        + "x=" + x
        + ", y=" + y
        + "}";
  }

  /**
   * Construct a new immutable {@code Point} instance.
   * @param x The value for the {@code x} attribute
   * @param y The value for the {@code y} attribute
   * @return An immutable Point instance
   */
  public static ImmutablePoint of(int x, int y) {
    return new ImmutablePoint(x, y);
  }

  /**
   * Creates an immutable copy of a {@link Point} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Point instance
   */
  public static ImmutablePoint copyOf(Point instance) {
    if (instance instanceof ImmutablePoint) {
      return (ImmutablePoint) instance;
    }
    return ImmutablePoint.of(instance.getX(), instance.getY());
  }
}
