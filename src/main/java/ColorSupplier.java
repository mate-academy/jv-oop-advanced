import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"blue", "green", "red", "white"};

    public String getRandomColor() {
        int randomColor = new Random().nextInt(COLORS.length);
        return COLORS[randomColor];
    }
}
