public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}