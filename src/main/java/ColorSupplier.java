import java.util.Random;

public class ColorSupplier {
    protected static final String[] colors = new String[]{"blue", "green", "red", "white"};

    public String getRandomColor() {
        int randomColor = new Random().nextInt(colors.length);
        return colors[randomColor];
    }
}
