package hgw;

public class Ravenclaw  extends Student{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String name, String surName, int magicPower, int transgressPower, int mind, int wisdom, int wit, int creativity) {
        super(name, surName, magicPower, transgressPower);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Студент Когтевран: " + getName() + " " + getSurName() + ". Имеет характеристики: Магическая сила "
                + getMagicPower() + ", Уровень трансгресирования " + getTransgressPower() + " Личные качества: Ум "
                + getMind() + " Мудрость " + getWisdom() + " Острота ума " + getWit() + " Творчество "
                + getCreativity() + ".";
    }
}
