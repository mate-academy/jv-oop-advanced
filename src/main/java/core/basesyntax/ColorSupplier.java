//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"red", "green", "blue", "yellow", "purple", "black"};
    private final Random random = new Random();

    public ColorSupplier() {
    }

    public String getRandomColor() {
        return COLORS[this.random.nextInt(COLORS.length)];
    }
}
