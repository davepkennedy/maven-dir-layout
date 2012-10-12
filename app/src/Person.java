package net.davepkennedy;

public class Person {
  int age;
  String name;

  public Person (String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName () {
    return this.name;
  }

  public int getAge () {
    return this.age;
  }
}
