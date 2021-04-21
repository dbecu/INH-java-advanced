package nl.inholland.mysecondapi.model;

import java.util.UUID;

public class Character {
    private UUID uuid;
    private String name;
    private int age;
    private String power;

    public Character(String name, int age, String power) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", power='" + power + '\'' +
                '}';
    }
}
