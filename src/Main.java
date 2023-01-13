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
    public static void task1(){
        System.out.println("Задача 1");
        int savings = 15000;
        int total = 0;
        int i=0;
        while (total < 2_459_000){
            total = total + savings;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого месяцев " + i + ", итого сумма равна " + total + " рублей");
        {
            System.out.println();
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int q = 0;
        while (q < 10){
            q++;
            System.out.print(q + " ");
        }
        System.out.println();
        for (; q > 0; q--){
            System.out.print(q + " ");
        }
        System.out.println();
        {
            System.out.println();
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        int totalPeople = 12_000_000;
        int birthPeople = 17;
        int deadPeople = 8;
        int dynamicsPopulation = totalPeople / 1000 * (birthPeople - deadPeople);
        int year = 0;
        while (year < 10){
            year++;
            totalPeople = dynamicsPopulation  + totalPeople ;
            System.out.println("В " +year+ " год, численность населения составляет " +totalPeople);
        }
        System.out.println();
    }
    public static void task4(){
        System.out.println("Задача 4");
    }
    public static void task5(){
        System.out.println("Задача 5");
    }
    public static void task6(){
        System.out.println("Задача 6");
    }
    public static void task7(){
        System.out.println("Задача 7");
    }
    public static void task8(){
        System.out.println("Задача 8");
    }
}