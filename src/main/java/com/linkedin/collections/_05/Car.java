package com.linkedin.collections._05;

import java.util.Objects;

public class Car {

  private String make;

  private String model;

  private int mileage;

  public Car(String make, String model, int mileage) {
    this.make = make;
    this.model = model;
    this.mileage = mileage;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  @Override
  public String toString() {
    return "Car{" +
        "make='" + make + '\'' +
        ", model='" + model + '\'' +
        ", mileage=" + mileage +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    Car c = (Car) o;
    System.out.format("Comparing %s %s with %s %s %n",
        this.make, this.model, c.make, c.model);

    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Car car = (Car) o;

    if (!Objects.equals(make, car.make)) {
      return false;
    }
    return Objects.equals(model, car.model);
  }

  @Override
  public int hashCode() {
    int result = make != null ? make.hashCode() : 0;
    result = 31 * result + (model != null ? model.hashCode() : 0);
    result = 31 * result + mileage;
    return result;
  }
}
