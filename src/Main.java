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
        task9();
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

        int capacity = 102;
        int sitsCount = 60;
        int stayCount = capacity - sitsCount;


        int sitsUsed = 55;
        int stayUsed = 17;
        if (sitsUsed < sitsCount) {
            System.out.println("Есть еще " + (sitsCount - sitsUsed) + " сидячих мест");
        }
        if (sitsUsed == sitsCount) {
            System.out.println("Сидячих мест нет");
        }
        if (stayUsed < stayCount) {
            System.out.println("Есть еще " + (stayCount - stayUsed) + " стоячих мест");
        }
        if (stayUsed == stayCount) {
            System.out.println("Стоячих мест нет");
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

        int capacity = 102;
        int sitsCount = 60;
        int stayCount = capacity - sitsCount;


        int sitsUsed = 50;
        int stayUsed = 35;
        if (sitsUsed < sitsCount) {
            System.out.println("Есть еще " + (sitsCount - sitsUsed) + " сидячих мест");
        }
        else {
            System.out.println("Сидячих мест нет");
        }
        if (stayUsed < stayCount) {
            System.out.println("Есть еще " + (stayCount - stayUsed) + " стоячих мест");
        }
        else  {
            System.out.println("Стоячих мест нет");
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

        int age = 15;

        if (age < 5) {
            System.out.println("Ребенку нельзя кататься на аттракционе");
        }
        else if (age < 14) {
            System.out.println("Ребенку можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }
    }
    public static void task9() {
        System.out.println("Домашнее задание 3 Часть 3");

        int one = 3;
        int two = 3;
        int three = 3;

        if (one > two) {
            if (one >= three) {
            System.out.println("Максимальное число - " + one);
        }else{
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        }else {
            if (one > three) {
                System.out.println("Максимальное число - " +one);
            }else if (three > one) {
                System.out.println("Максимальное число - " +three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
        }

    }