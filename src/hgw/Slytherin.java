package hgw;

public class Slytherin extends Student{
    private int cunning;

    private int determination;

    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surName, int magicPower, int transgressPower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surName, magicPower, transgressPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public String toString() {
        return "Студент Слизерин: " + getName() + " " + getSurName() + ". Имеет характеристики: Магическая сила "
                + getMagicPower() + ", Уровень трансгресирования " + getTransgressPower() + " Личные качества: Хитрость "
                +getCunning() + " Решительность " + getDetermination() + " Амбициозность " + getAmbition() + " Находчивость "
                + getResourcefulness() + " Жажду к власти " + getThirstForPower() +".";
    }

    public int FullScore () {
        int full = this.getMagicPower() + this.getTransgressPower() + this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getThirstForPower();
        return full;
    }


    public String FindTheBest(Slytherin name1, Slytherin name2) {
        if (name1.FullScore() < name2.FullScore()) {
            return "Лучший ученик на курсе Слизерин: " + name2.getName() + " " + name2.getSurName() + ", чем " + name1.getName() + " " + name1.getSurName();
        } else {
            return "Лучший ученик на курсе Слизерин: " + name1.getName() + " " + name1.getSurName() + ", чем " + name2.getName() + " " + name2.getSurName();
        }
    }

    public int FullScoreMagic() {
        int full = this.getMagicPower() + this.getTransgressPower();
        return full;
    }
}
