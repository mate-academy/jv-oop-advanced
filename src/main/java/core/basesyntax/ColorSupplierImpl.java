package core.basesyntax;

import java.util.Random;

public class ColorSupplierImpl implements ColorSupplier {
    private Random random = new Random();

    @Override
    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
