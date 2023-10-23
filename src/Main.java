import creationalpatterns.abstractfactory.Client;
import creationalpatterns.abstractfactory.DatabaseFactory;
import creationalpatterns.abstractfactory.NetworkFactory;
import creationalpatterns.factory.Shape;
import creationalpatterns.factory.ShapeFactory;
import creationalpatterns.singleton.SingletonEager;
import creationalpatterns.singleton.SingletonLazy;
import creationalpatterns.singleton.SingletonStaticBlock;
import creationalpatterns.singleton.SingletonThreadSafe;

public class Main {
    public static void main(String[] args) {
        SingletonEager singletonEager=SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println(singletonEager);

        SingletonStaticBlock singletonStaticBlock =SingletonStaticBlock.getInstance();
        System.out.println(singletonStaticBlock);
        System.out.println(singletonStaticBlock);

        SingletonLazy singletonLazy =SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy);

        SingletonThreadSafe singletonThreadSafe =SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe);
        System.out.println(singletonThreadSafe);


        ShapeFactory shapeFactory =new ShapeFactory();
        Shape burrito=shapeFactory.getFood("Cylinder");
        System.out.println("factory "+burrito.getShape());


        Client client1=new Client(new DatabaseFactory());
        client1.communicate();
        Client client2=new Client(new NetworkFactory());
        client2.communicate();

    }
}