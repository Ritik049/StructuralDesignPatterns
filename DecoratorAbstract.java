package DecoratorDesignPattern;

public  abstract class DecoratorAbstract implements Notifier{

    Notifier notifier ;
    public DecoratorAbstract(Notifier notifier)
    {
        this.notifier = notifier;
    }

    public void send(String message)
    {
        notifier.send(message);
    }


}
