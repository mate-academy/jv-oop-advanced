package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    private final String[] color = {"blue","yellow","purple","black",
            "white","green","brown","pink"};

    public String getRandomColor() {
        int index = new Random().nextInt(color.length);
        return color[index];
    }

}
