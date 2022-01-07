import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors c = Colors.values()[index];
        String r = c.toString();
        return r;
    }
}
