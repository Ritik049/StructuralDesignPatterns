package DecoratorDesignPattern;

public class EmailNotifier extends  DecoratorAbstract{

      public EmailNotifier(Notifier notifier)
      {
           super(notifier);
      }

      public  void send(String message)
      {
          super.send(message);
          System.out.println("EMail Notifier "+message);
      }
}
