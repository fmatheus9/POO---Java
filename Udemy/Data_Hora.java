import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class OperaçõesDataHora {

    public static void main(String[] args) {
        //instanciação local-date
        LocalDate d01 = LocalDate.now();
        System.out.println("D01: " + d01);

        //instanciação local-date-time
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("D02: " + d02);

        //local-date-time GNT - horario do fuso horario 0
        Instant d03 = Instant.now();
        System.out.println("D03: " + d03);

        //texto ISO 8601 -> local-date
        LocalDate d04 = LocalDate.parse("2024-08-06");
        System.out.println("D04: " + d04);

        //HORARIO GLOBAL
        Instant d05 = Instant.parse("2024-08-06T01:20:20Z");
        System.out.println("D05: " + d05);

        System.out.println("------------------------");

        //Formatação - objeto data-hora em texto
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("D04 format: " + d04.format(fmt1));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm");
        System.out.println("D02 format: " + d02.format(fmt2));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm").withZone(ZoneId.systemDefault());
        System.out.println("D03 format: " + fmt3.format(d03));

        System.out.println("------------------------");

        //Converter Data-hora global para local

        //converte um instante global para uma data local considerando o fuso do computador
        LocalDate r1 = LocalDate.ofInstant(d05, ZoneId.systemDefault());
        System.out.println("R1: " + r1.format(fmt1));
        LocalDate r2 = LocalDate.ofInstant(d05, ZoneId.of("Portugal"));
        System.out.println("R2: " + r2.format(fmt1));

        //Recuperando dia-mes-ano-hora
        System.out.println("Dia D04: " + d04.getDayOfMonth());
        System.out.println("Mês D04: " + d04.getMonth());
        System.out.println("Ano D04: " + d04.getYear());
        System.out.println("Hora D02: " + d02.getHour());
        System.out.println("Minuto D02: " + d02.getMinute());

        System.out.println("------------------------");

        //Calculos
        LocalDate lc1 = LocalDate.parse("2024-08-07");
        LocalDate lc2 = LocalDate.parse("2024-08-01");

        LocalDateTime lct1 = LocalDateTime.parse("2024-08-07T12:00:00");
        LocalDateTime lct2 = LocalDateTime.parse("2024-08-01T12:00:00");

        Instant inst1 = Instant.now();
        Instant inst2 = Instant.parse("2024-08-01T12:00:00Z");

        System.out.println(lc1);
        System.out.println(lc2);
        System.out.println(lct1);
        System.out.println(lct2);
        System.out.println(inst1);
        System.out.println(inst2);

        LocalDate pastWeekLocalDate = lc1.minusWeeks(1);
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        LocalDate nextWeekLocalDate = lc2.plusWeeks(1);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

        LocalDateTime plusHour = lct1.plusHours(2);
        System.out.println("plusHour: " + plusHour);

        Instant pastWeekInstant = inst1.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        Instant instantNowPlus1y = inst1.plus(365, ChronoUnit.DAYS);
        System.out.println("instantNowPlus1y: " + instantNowPlus1y);

        //Duração - So da pra fazer com LocalDateTime
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atTime(0,0));
        System.out.println(t1.toDays());

    }
}

