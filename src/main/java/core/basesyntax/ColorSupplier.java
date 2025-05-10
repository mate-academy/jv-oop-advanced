package core.basesyntax;

import static core.basesyntax.Main.rnd;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = new String[]{"red", "grey", "white", "black", "yellow", "orange", "blue"};
        int i = rnd(colors.length);
        return colors[i];
    }
}
