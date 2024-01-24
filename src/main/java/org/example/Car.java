package org.example;

public class Car {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.hashCode());
        Class<? extends Car> class1 = car.getClass();
        System.out.println(class1.getName());
        ClassLoader classLoader = class1.getClassLoader();
        System.out.println(classLoader);

        System.out.println(classLoader.getParent());

        System.out.println(classLoader.getParent().getParent());

        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
    }
}
