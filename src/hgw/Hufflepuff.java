package hgw;

public class Hufflepuff extends Student{
    private int diligence;

    private int loyality;

    private int honesty;
    public Hufflepuff(String name, String surName, int magicPower, int transgressPower, int diliegnce, int loyality, int honesty) {
        super(name, surName, magicPower, transgressPower);
        this.diligence = diliegnce;
        this.loyality = loyality;
        this.honesty = honesty;
    }
    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diliegnce) {
        this.diligence = diliegnce;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент Пуффендуя: " + getName() + " " + getSurName() + ". Имеет характеристики: Магическая сила "
                + getMagicPower() + ", Уровень трансгресирования " + getTransgressPower() + " Личные качества: Трудолюбие "
                + getDiligence() + " Верность " + getLoyality() + " Честность " + getHonesty() + ".";
    }
}
