import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = new String[]{"blue", "green", "red", "white"};
        int randomColor = new Random().nextInt(colors.length);
        return colors[randomColor];
    }
}
