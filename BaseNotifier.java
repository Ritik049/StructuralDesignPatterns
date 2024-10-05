package DecoratorDesignPattern;

public class BaseNotifier implements Notifier{
//     String message;
//    public BaseNotifier(String message)
//    {
//        this.message = message;
//    }
    @Override
    public void send(String message)
    {
        System.out.println("BASE Notifier "+message);
    }
}
