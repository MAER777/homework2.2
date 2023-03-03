import hgw.*;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
//        Student garry = new Student ("Гарри", "Поттер", 100, 20);
//        Student germiona = new Student("Гермиона", "Грейнджер", 56, 90);
//        Student ron = new Student("Рон", "Уизли", 2, 100);
//
//        Student drako = new Student("Драко", "Малфой", 88, 23);
//        Student graham = new Student("Грэхэм", "Монтегю", 11, 95);
//        Student gregory = new Student("Грегори", "Гойл", 60, 30);
//
//        Student zahary = new Student("Захария", "Смит", 80, 12);
//        Student sedrick = new Student("Седрик", "Диггори", 70, 22);
//        Student djastin = new Student("Джастин", "Финч-Флетчли", 33, 11);
//
//        Student joy = new Student("Чжоу", "Чанг", 89, 54);
//        Student padma = new Student("Падма", "Патил", 45, 53);
//        Student markus = new Student("Маркус", "Белби", 87, 88);


        Gryffindor garry = new Gryffindor("Гарри", "Поттер", 100, 20, 2, 3, 4);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 56, 90, 4,2,6);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 2, 100,1,6,4);


//        System.out.println("garry.toString() = " + garry.toString());
        System.out.println("garry = " + garry);
        System.out.println("germiona = " + germiona);
        System.out.println("ron = " + ron);
        System.out.println();

        Ravenclaw joy = new Ravenclaw("Чжоу", "Чанг", 89, 54, 10,3,4,2);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 45, 53, 9,1,2,2);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 87, 88, 13,2,5,7);

        System.out.println("joy = " + joy);
        System.out.println("padma = " + padma);
        System.out.println("markus = " + markus);
        System.out.println();

        Hufflepuff zahary = new Hufflepuff("Захария", "Смит", 80, 12,2,10,5);
        Hufflepuff sedrik = new Hufflepuff("Седрик", "Диггори", 70, 22,2,10,5);
        Hufflepuff djastin = new Hufflepuff("Джастин", "Финч-Флетчли", 33, 11,2,10,5);

        System.out.println("zahary = " + zahary);
        System.out.println("sedrik = " + sedrik);
        System.out.println("djastin = " + djastin);
        System.out.println();

        Slytherin drako = new Slytherin("Драко", "Малфой", 88, 23, 10, 12, 33,11,100);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 11, 95, 1, 3, 5,1,50);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 60, 30, 14, 1, 7,3,10);

        System.out.println("drako = " + drako);
        System.out.println("graham = " + graham);
        System.out.println("gregory = " + gregory);
        System.out.println();

        System.out.println("garry.FullScore() = " + garry.FullScore());
        System.out.println("garry.FindTheBest(garry, germiona) = " + garry.FindTheBest(garry, germiona));
    }
}