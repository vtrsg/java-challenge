import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public static String dateFormat(String dateInput) {
        String[] formats = {"dd/MM/yyyy", "dd MM yyyy", "ddMMyyyy", "yyyy MM dd"};

        for (String format : formats) {
            try {
                SimpleDateFormat inputFormat = new SimpleDateFormat(format);
                inputFormat.setLenient(false);
                Date date = inputFormat.parse(dateInput);

                SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy MM");
                return outputFormat.format(date);
            } catch (ParseException e) {

            }
        }

        return null;
    }
}