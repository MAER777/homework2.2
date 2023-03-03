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

    public int FullScore () {
        int full = this.getMagicPower() + this.getTransgressPower() + this.getDiligence() + this.getLoyality() + this.getHonesty();
        return full;
    }


    public String FindTheBest(Hufflepuff name1, Hufflepuff name2) {
        if (name1.FullScore() < name2.FullScore()) {
            return "Лучший ученик на курсе Пуффендуй: " + name2.getName() + " " + name2.getSurName() + ", чем " + name1.getName() + " " + name1.getSurName();
        } else {
            return "Лучший ученик на курсе Пуфендуй: " + name1.getName() + " " + name1.getSurName() + ", чем " + name2.getName() + " " + name2.getSurName();
        }
    }

    public int FullScoreMagic() {
        int full = this.getMagicPower() + this.getTransgressPower();
        return full;
    }

    public String findTheBestPowerHyffandSlyth(Hufflepuff name1, Slytherin name2) {
        if (name1.FullScoreMagic() < name2.FullScoreMagic()) {
            return "Ученик: " + name2.getName() + " " + name2.getSurName() + ", обладает большей мощностью магии, чем " + name1.getName() + " " + name1.getSurName();
        } else {
            return "Ученик: " + name1.getName() + " " + name1.getSurName() + ", обладает большей мощностью магии, чем " + name2.getName() + " " + name2.getSurName();
        }
    }
}
