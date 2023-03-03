package hgw;

public class Student {
    private String name;

    private String surName;

    private int magicPower;

    private int transgressPower;

    public Student(String name, String surName, int magicPower, int transgressPower) {
        this.name = name;
        this.surName = surName;
        this.magicPower = magicPower;
        this.transgressPower = transgressPower;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressPower() {
        return transgressPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressPower(int transgressPower) {
        this.transgressPower = transgressPower;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Имя '" + name + '\'' +
                " Фамилия' " + surName + '\'' +
                ", Магическая сила " + magicPower +
                ", Трансгрессирующая сила " + transgressPower +
                '}';
    }
}
