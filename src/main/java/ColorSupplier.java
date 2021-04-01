import java.util.Random;

public class ColorSupplier {
    public static final String[] COLOURS = new String[]{
        "brown", "blue", "yellow", "white", "black", "green", "grey", "orange"
    };

    public String getColour() {
        Random random = new Random();
        int randomColour = random.nextInt(COLOURS.length);
        return COLOURS[randomColour];
    }
}

