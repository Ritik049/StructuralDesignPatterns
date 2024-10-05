package DecoratorDesignPattern;

public class SMSNotifier  extends DecoratorAbstract{

    public SMSNotifier(Notifier notifier)
    {
        super(notifier);
    }

    public void send(String message)
    {
        super.send(message);
        System.out.println("SMS Notifier "+message);
    }
}
