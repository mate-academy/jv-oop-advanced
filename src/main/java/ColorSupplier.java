import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"White", "Red", "Blue", "Green"};

    private final Random random = new Random();


    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
