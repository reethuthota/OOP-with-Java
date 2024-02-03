public class Animal
{
    public static void run(String s)
    {
        System.out.println("I am running statically");
    }
    public void run()
    {
        System.out.println("I am an instance method1pec");
    }

    public static void main(String args[])
    {
        System.out.println("Size of args : " + args.length);
        if (args.length > 0)
            System.out.println("argument 0: " + args[0]);
        Animal.run(null);
        Animal animal = new Animal();
        animal.run();
        System.exit(-1);
    }
}