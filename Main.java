package DecoratorDesignPattern;

public class Main {

    public static void main(String[]args)
    {
         Notifier n1 = new BaseNotifier();

         Notifier sms = new SMSNotifier(n1);

         Notifier email = new EmailNotifier(sms);

         sms.send("Your account is credited");

         System.out.println("*********************** ");

         email.send("You get a job");







    }
}
