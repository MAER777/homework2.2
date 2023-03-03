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

    public int FullScore () {
        int full = this.getMagicPower() + this.getTransgressPower() + this.getMind() + this.getWisdom() + this.getWit()+ getCreativity();
        return full;
    }


    public String FindTheBest(Ravenclaw name1, Ravenclaw name2) {
        if (name1.FullScore() < name2.FullScore()) {
            return "Лучший ученик на курсе Когтевран: " + name2.getName() + " " + name2.getSurName() + ", чем " + name1.getName() + " " + name1.getSurName();
        } else {
            return "Лучший ученик на курсе Когтевран: " + name1.getName() + " " + name1.getSurName() + ", чем " + name2.getName() + " " + name2.getSurName();
        }
    }

    public int FullScoreMagic() {
        int full = this.getMagicPower() + this.getTransgressPower();
        return full;
    }

    public String findTheBestPowerRaveandHuff(Ravenclaw name1, Hufflepuff name2) {
        if (name1.FullScoreMagic() < name2.FullScoreMagic()) {
            return "Ученик: " + name2.getName() + " " + name2.getSurName() + ", обладает большей мощностью магии, чем " + name1.getName() + " " + name1.getSurName();
        } else {
            return "Ученик: " + name1.getName() + " " + name1.getSurName() + ", обладает большей мощностью магии, чем " + name2.getName() + " " + name2.getSurName();
        }
    }
    public String findTheBestPowerRaveandSlyth(Ravenclaw name1, Slytherin name2) {
        if (name1.FullScoreMagic() < name2.FullScoreMagic()) {
            return "Ученик: " + name2.getName() + " " + name2.getSurName() + ", обладает большей мощностью магии, чем " + name1.getName() + " " + name1.getSurName();
        } else {
            return "Ученик: " + name1.getName() + " " + name1.getSurName() + ", обладает большей мощностью магии, чем " + name2.getName() + " " + name2.getSurName();
        }
    }
}
