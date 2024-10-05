package ProxyDesignPattern;

public class ProxyDatabase implements Connection{

    public Connection database;

    public void process()
    {
        if(database==null)
        {
            database = new DatabaseConnection();
        }

        database.process();
    }


}
