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

    public String getColour() {
        Random random = new Random();
        int randomColour = random.nextInt(colours.length);
        return colours[randomColour];
    }
}
