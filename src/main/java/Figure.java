import core.basesyntax.ColorSupplier;

import java.util.Random;

public abstract class Figure {

    Random random = new Random();

    public abstract double getArea();
    public abstract void draw();



    public ColorSupplier getColor() {

        ColorSupplier [] losowanieKolorow = ColorSupplier.values();
        int index = random.nextInt(losowanieKolorow.length);
        return losowanieKolorow[index];
    }
}
