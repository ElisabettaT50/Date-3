import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd, MMMM, yyyy, hh, mm, ss", Locale.UK);
        //String formattedDate = date.format(formatter);
        Integer year = date.getYear();
        String month = String.valueOf(date.getMonth());
        Integer dayOfMonth = date.getDayOfMonth();
        String dayWeek = String.valueOf(date.getDayOfWeek());

        System.out.println("Anno: " + year + '\n' + "Mese: " + month + '\n' + "Giorno del mese: " + dayOfMonth + '\n' + "Giorno della settimana: " + dayWeek);

    }
}