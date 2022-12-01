public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
            System.out.println("Можете искать себе работу");
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

        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, необходимо еще немного подождать");
        }

    }

    public static void task5() {
        System.out.println("Домашнее задание 2 Часть 2");
        int age = 50;

        if (age < 7) {
            System.out.println("Ребенок может пока отдыхать");
        } else if (age >= 7 && age < 18) {
            System.out.println("Ребенку пора в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Ученик может поступить в университет");
        } else {
            System.out.println("Можете искать себе работу");
        }
    }

    public static void task6() {
        System.out.println("Домашнее задание 2 Часть 3");

        int place = 60;

        if (place < 60) {
            System.out.println("В автобусе есть сидячие места");
        } else if (place <= 101 && place >= 60) {
            System.out.println("В автобусе есть стоячие места");
        } else {
            System.out.println("В автобусе нет мест");
        }
    }

    public static void task7() {
        System.out.println("Домашнее задание 3 Часть 1");

        int age = 50;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task8() {
        System.out.println("Домашнее задание 3 Часть 2");

        int age = 13;

        if (age < 5) {
            System.out.println("Ребенку нельзя кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Ребенку можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }
    }
}