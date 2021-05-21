
import java.util.Observable;
import java.util.Random;

public class vejr extends Observable // vi laver en klasse hvilket extends fra Observable hvilket vi har impoteret
{
    private String vejr;
    Random r = new Random();

    public vejr(String vejr)
    {
        this.vejr = vejr;
    }

    public double getVejr()

    {
        Random r = new Random();
        double Minpuls = 0;
        double Maxpuls = 50;
        double vejr = Minpuls + (Maxpuls - Minpuls)* r.nextDouble();
        return vejr;
    }

    public void setVejr(String vejr)
    {
        this.vejr = vejr;
        setChanged();
        notifyObservers();   // hvis der sker ændringer skal den notificere observer
    }


}