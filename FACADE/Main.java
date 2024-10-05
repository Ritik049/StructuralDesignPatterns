package FacadeDesignPattern;

public class Main {

    public static void main(String []args)
    {
         DVDPlayer dvd = new DVDPlayer();
         Projector projector = new Projector();
         SoundSystem soundSystem = new SoundSystem();

         HomeTheatreFacade home = new HomeTheatreFacade(dvd,projector,soundSystem);

         home.start();

         home.end();
    }
}
