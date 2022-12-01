public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание1");

        int age = 17;

        if (age >= 18)
            System.out.println("Поздравляем с совершеннолетием");

        if (age < 18)
            System.out.println("Возраст совершеннолетия ещё не наступил, необходимо еще немного подождать");

    }

    public static void task2() {
        System.out.println("Задание2");

        int age = 20;

            if (age < 7) {
                System.out.println("Ребенок может пока отдыхать");
            }
            if (age >= 7 && age < 18) {
                System.out.println("Ребенку пора в школу");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Ученик может поступить в университет");
            }
            if (age >= 24) {
                System.out.println("Поздравляем с окончанием университета, можете искать первую работу");
            }

    }
    public static void task3() {
        System.out.println("Задание3");

        int place = 102;

        if (place < 60) {
            System.out.println("В автобусе есть сидячие места");
        }
        if (place <= 101 && place >= 60) {
            System.out.println("В автобусе есть стоячие места");
        }
        if (place > 101) {
            System.out.println("В автобусе нет мест");
        }
    }
    public static void task4() {
        System.out.println("Домашнее задание 2 Часть 1");
        int age = 15;

        if (age >= 18){
            System.out.println("Поздравляем с совершеннолетием");}
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, необходимо еще немного подождать");}

    }
}