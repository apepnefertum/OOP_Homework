import java.util.ArrayList;
import java.util.Date;

public class Zeitansager {
    private String datumString;
    private ArrayList<Zuhoerer> abbonenten;

    public Zeitansager() {
        abbonenten = new ArrayList<>();
    }

    public void schreibeEin(Zuhoerer zuhoerer) {
        if (zuhoerer != null) {
            // subscribe to the event
            abbonenten.add(zuhoerer);

            abbonenten.add(zuhoerer);
            zuhoerer.setAnsager(this);
        }
    }

    public void trageAus(Zuhoerer zuhoerer) {
        if (zuhoerer != null) {
            abbonenten.remove(zuhoerer);
            zuhoerer.setAnsager(null);
        }
    }

    public String getZeit() {
        return datumString;
    }

    public void sagAn() {
        Date currentDate = new Date();
        datumString = currentDate.toString();

        for (Zuhoerer zuhoerer : abbonenten) {
            zuhoerer.update();
        }
    }
}