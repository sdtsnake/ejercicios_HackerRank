package work.oscarramos.ejercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    Programa para convertir la hora meridiano en hora militar.
 */
public class ConvertirHoraMeridianoMilitar {
    public static String convertirForma1(String s){
        int hora = Integer.parseInt(s.substring(0,2));
        if(s.indexOf("PM")>0){
            if(hora != 12)
                hora = hora + 12;
        }else{
            if(hora==12){
                hora = 0;
            }
        }
        Formatter fmt = new Formatter();

        return String.valueOf(fmt.format("%02d",hora) + s.substring(2,8));
    }

    public static String convertirUsandoFormatos(String s) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";
        time = dateFormat.parse(s);

        output = format.format(time);

        return output;
    }

    public static String convertirUsandoExpresionesRegulares(String s){
        String horaMilitar = "";

        Pattern patronHora = Pattern.compile("(\\d{1,2}):(\\d{2}):(\\d{2})(AM|PM)", Pattern.CASE_INSENSITIVE);
        Matcher matcherHora = patronHora.matcher(s);

        if (matcherHora.matches()) {
            int hora = Integer.parseInt(matcherHora.group(1));
            int minutos = Integer.parseInt(matcherHora.group(2));
            int segundos = Integer.parseInt(matcherHora.group(3));
            String amPm = matcherHora.group(4);

            if (amPm.equalsIgnoreCase("PM") && hora < 12) {
                hora += 12;
            }
            if (amPm.equalsIgnoreCase("AM") && hora == 12) {
                hora = 0;
            }

            horaMilitar = String.format("%02d:%02d:%02d", hora, minutos,segundos);
        }

        return horaMilitar;
    }
}
