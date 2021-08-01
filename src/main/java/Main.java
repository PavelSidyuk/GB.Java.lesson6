import java.util.Random;

public class Main {
    static Random random = new Random();
    static int distanceRun = random.nextInt(500);
    static int distanceSwim = random.nextInt(10);

    public static void main (String[] args) {

        Runnable[] runnable = new Runnable[6];

        runnable[0] = new Dog("Шарик");
        runnable[1] = new Dog("Тузик");
        runnable[2] = new Dog("Рекс");
        runnable[3] = new Cat("Мурзик");
        runnable[4] = new Cat("Борис Николаевич");
        runnable[5] = new Cat("Мурка");

        doRunnable(runnable, distanceRun, distanceSwim);
        System.out.println("***************");
        Dog.coutDog();
        Cat.coutCat();
        Animal.cout();
    }


    public static void doRunnable (Runnable[] runnable, int distanceRun, int distanceSwim) {
        /*for (int i = 0; i < runnable.length; i++) {
            runnable[i].toRun(distanceRun);
            runnable[i].toSwim(distanceSwim);
            System.out.println("================");
        }*/

        for (Runnable r : runnable) {
            r.toRun(distanceRun);
            r.toSwim(distanceSwim);
            System.out.println("===============");

        }

    }


}
