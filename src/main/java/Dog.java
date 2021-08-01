import java.util.Random;

public class Dog extends Animal implements Runnable {
    private Random random = new Random();
    private int ran = random.nextInt(500);
    private  int swim = random.nextInt(10);
    private static int counter=0;
    public int id;
    {
        id = ((counter++) +1);

    }

    @Override
    public String toString () {
        return "Dog{" +
                ", ran=" + ran +
                ", swim=" + swim +
                ", counter=" + counter +
                '}';
    }

    public Dog (String name) {
        super(name);
    }

    public Dog (String name, int ran, int swim) {
        super(name);
        this.ran = ran;
        this.swim = swim;
    }

    @Override
    public void toSwim (int distance) {
            if (swim >= distance){
                System.out.println(name+" проплыл :" + distance + "метров");
            }else {
                System.out.println( name + " не доплыл (");
            }
    }

    @Override
    public void toRun (int distance) {
        if (ran >= distance){
            System.out.println("Собакен №: "+ id + "\n" + name + " пробежал :" + distance + " метров");
        }else {
            System.out.println("Собакен №: "+ id + "\n" + name +  " не добежал до конца (");
        }
    }

    public static void coutDog (){
        System.out.println("Собак всего : " +counter);
    }
}
