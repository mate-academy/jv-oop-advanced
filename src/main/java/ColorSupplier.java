import java.util.Random;

public class ColorSupplier {
    public static final String[] colours = new String[]{
            "brown", "blue", "yellow", "white", "black", "green", "grey", "orange"
    };

    public static String getColour() {
        Random random = new Random();
        int randomColour = random.nextInt(colours.length);
        return colours[randomColour];
    }
}

