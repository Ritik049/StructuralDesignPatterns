package FacadeDesignPattern;

public class HomeTheatreFacade {

     DVDPlayer dvd ;
     Projector projector;
     SoundSystem soundSystem;

     public HomeTheatreFacade(DVDPlayer dvd, Projector projector, SoundSystem soundSystem) {
         this.dvd = dvd;
         this.projector = projector;
         this.soundSystem = soundSystem;

     }

     public void start()
     {
         dvd.on();
         soundSystem.on();
         projector.on();
         dvd.play();
     }

     public void end()
     {
         dvd.off();
         soundSystem.off();
         projector.off();
     }
}
