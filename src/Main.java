public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        // Задание 2
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println();
        // Задание 3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        if (temp <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();
        // Задание 4
        int ageHuman = 10;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему пора ходить на работу");
        }
        System.out.println();
        // Задание 5
        int ageKid = 10;
        boolean anEscort = false;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
        }
        if (ageKid >= 5 && ageKid <= 14) {
            if (anEscort) {
                System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении");
            } else {
                System.out.println("Если возраст ребенка равен " + ageKid + " и если взрослого нет, то кататься нельзя");
            }
        }
        if (ageKid > 14) {
            System.out.println("Если возраст равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        // Задание 6
        int buyTicketsPlaces = 120;
        int allPlaces = 102;
        int seatingPlaces = 60;
        int standingPlaces = (allPlaces - seatingPlaces);
        boolean thereArePlaces = (buyTicketsPlaces > allPlaces);
        if (thereArePlaces) {
            System.out.println("Мест в вагоне нет!");
        } else {
            if (buyTicketsPlaces < seatingPlaces) {
                System.out.println("Продано: " + buyTicketsPlaces + " мест, осталось: Сидячие места в вагоне: " + (seatingPlaces - buyTicketsPlaces) + ", стоячие: " + standingPlaces);
            } else {
                System.out.println("В вагоне осталось " + (allPlaces - buyTicketsPlaces) + " стоячих мест");
            }
        }
        System.out.println();
        // Задание 7
        int one = 5;
        int two = 8;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println("Число " + three + " больше остальных");
            }
        System.out.println();

    }
}