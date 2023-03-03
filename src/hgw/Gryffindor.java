package hgw;

public class Gryffindor extends Student {
    private int nobility;

    private int honor;

    private int bravely;

    public Gryffindor(String name, String surName, int magicPower, int transgressPower, int nobility, int honor, int bravely) {
        super(name, surName, magicPower, transgressPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravely = bravely;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravely() {
        return bravely;
    }

    public void setBravely(int bravely) {
        this.bravely = bravely;
    }


    @Override
    public String toString() {
        return "Студент Гриффиндора: " + getName() + " " + getSurName() + ". Имеет характеристики: Магическая сила "
                + getMagicPower() + ", Уровень трансгресирования " + getTransgressPower() + " Личные качества: Благородство "
                + getNobility() + " Честь " + getHonor() + " Храбрость " + getBravely() + ".";
    }

    public int FullScore () {
        int full = this.getMagicPower() + this.getTransgressPower() + this.getHonor() + this.getBravely() + this.getNobility();
        return full;
    }


    public String FindTheBest(Gryffindor name1, Gryffindor name2) {
        if (name1.FullScore() < name2.FullScore()) {
            return "Лучший ученик на курсе Грифиндор: " + name2.getName() + " " + name2.getSurName();
        } else {
            return "Лучший ученик на курсе Грифиндор: " + name1.getName() + " " + name1.getSurName();
        }
    }
}


