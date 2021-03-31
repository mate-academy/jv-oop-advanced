import java.util.Random;

public class ColourSupplier {
    private String[] colours = new String[]{
            "brown", "blue", "yellow", "white", "black", "green", "grey", "orange"
    };

    public String[] getColours() {
        return colours;
    }

    public void setColours(String[] colours) {
        this.colours = colours;
    }

    public static String getColour(String[] colours) {
        Random random = new Random();
        int randomColour = random.nextInt(colours.length);
        return colours[randomColour];
    }
}

