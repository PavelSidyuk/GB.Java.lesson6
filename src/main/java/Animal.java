public abstract class Animal {
    protected String name;
    private static int counter =0;
    public int id;
    {
        id = ((counter++) +1);
    }

    public Animal (String name) {
        this.name = name;

    }

    public static void cout (){
        System.out.println("Животных всего : " +counter);
    }


}
