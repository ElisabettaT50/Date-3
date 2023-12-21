import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
ES. 3
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console

ES.4
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
verificare che la prima data è precedente alla seconda
verificare che la seconda data è successiva alla prima
verificare che le due date sono uguali ad ora
Stampa il risultato
 */
public class Main {
    public static void main(String[] args) {

        //ES.3

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd, MMMM, yyyy, hh, mm, ss", Locale.UK);
        //String formattedDate = date.format(formatter);
        Integer year = date.getYear();
        String month = String.valueOf(date.getMonth());
        Integer dayOfMonth = date.getDayOfMonth();
        String dayWeek = String.valueOf(date.getDayOfWeek());

        System.out.println("Anno: " + year + '\n' + "Mese: " + month + '\n' + "Giorno del mese: " + dayOfMonth + '\n' + "Giorno della settimana: " + dayWeek);

        //ES.4

        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        Boolean before = date.isBefore(date2);
        Boolean after = date.isAfter(date2);
        Integer comparison = date.compareTo(date2);

        System.out.println("Data è precedente a data2? " + before);
        System.out.println("Data è successiva a data2? " + after);
        System.out.println("Quale posizione occupa data rispetto a data2 (usando un valore numerico)? " + comparison);
    }
}