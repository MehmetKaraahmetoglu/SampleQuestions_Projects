import java.time.Duration;
import java.time.LocalDateTime;

public class KalanGun {
    public static void main(String[] args) {
        LocalDateTime belirliGun = LocalDateTime.of(2023,12,1,00,00);

        LocalDateTime bugun = LocalDateTime.now();

        Duration duration = Duration.between(bugun,belirliGun);

        long day = duration.toDaysPart();
        long hour = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        System.out.println("Doguma: \n"+day+".Gün, "+hour+".saat, "+minutes+".dakika, "+seconds+".saniye kaldi");

    }
}
