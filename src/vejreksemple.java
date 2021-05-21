import java.util.Observable;
import java.util.Observer;

public class vejreksemple implements Observer   // observer interface bruges til notificere observer at der er ændringere i obervable det bruges ofte ved at implementer the observer pattern i java
{

    private vejr vejrUpdate ;

    @Override
    public void update(Observable observable, Object arg) // dette er den eneste metode observer interface har. Observable x er den enste objekt fra java.util.Observable klasse
    {                                                     // arg objectet er en valgfri objekt som kan videregives som objekt af notifiying observable class (A class that implements the Observer interface, declares itself eligible to listen to the changes made to the observables.)
        vejrUpdate = (vejr) observable;
        System.out.println("Weather Report Live. Its "+vejrUpdate.getVejr());
    }

    public static void main(String[] args)
    {
       vejr observable = new vejr(null);
        vejreksemple observer = new vejreksemple();
        observable.addObserver(observer);
        observable.setVejr("Bright and sunny...Let's play cricket!! ");
        observable.setVejr("Raining Heavily!..Let's have hot Pakodas!!");
    }
}


