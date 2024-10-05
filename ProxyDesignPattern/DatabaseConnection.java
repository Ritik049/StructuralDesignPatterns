package ProxyDesignPattern;

public class DatabaseConnection  implements  Connection{

    public DatabaseConnection()
    {
        heavyConfiguration();
    }

    public void  process()
    {
        System.out.println("Retrieving the entities....");
    }

    public void  heavyConfiguration()
    {
        System.out.println("Loading heavy configuration.....");
    }
}
