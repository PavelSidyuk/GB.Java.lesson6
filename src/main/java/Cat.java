import java.util.Random;

public class Cat extends Animal implements Runnable {
    private Random random = new Random();
    private int ran = random.nextInt(200);
    public int id;
    private static int counter;
    {
        id = ((counter++) + 1);
    }

    public Cat (String name) {
        super(name);
    }

    @Override
    public void toSwim (int distance) {
        System.out.println(name +" не умеет плавать");
    }

    @Override
    public void toRun (int distance) {
        if (ran >= distance){
            System.out.println("Кот №:"+ id+"\n" + name + " пробежал :" + distance + " метров");
        }else {
            System.out.println("Кот №:"+ id+"\n"  + name +  " не добежал до конца (");
        }
    }

    public static void coutCat (){
        System.out.println("Кошек всего : " +counter);
    }
}
