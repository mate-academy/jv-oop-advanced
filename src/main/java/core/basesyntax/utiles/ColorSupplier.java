package core.basesyntax.utiles;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        String []colors = {
                "White", "Black", "PeachPuff", "MintCream", "SlateBlue",
                "Khaki", "OliveDrab","BurlyWood", "LightSalmon", "Coral",
                "HotPink", "LemonChiffon", "AliceBlue", "LightGrey",
                "MediumTurquoise", "DarkSeaGreen", "Peru", "Tomato",
                "Orchid","PapayaWhip"};
        return colors[random.nextInt(colors.length)];
    }
}
