package suppliers;

import java.util.Random;

public class ColorSupplier {
    private String[] colours = {"white", "black", "red", "orange",
            "yellow", "green", "blue", "purple"};
    private Random random = new Random();

    public String[] getColours() {
        return colours;
    }

    public void setColours(String[] colours) {
        this.colours = colours;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return colours[random.nextInt(colours.length)];
    }
}
