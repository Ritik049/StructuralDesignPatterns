package ProxyDesignPattern;

public class Client {

    public static void main(String[]args)
    {
       Connection proxy = new ProxyDatabase();

        proxy.process();
        proxy.process();
    }
}
