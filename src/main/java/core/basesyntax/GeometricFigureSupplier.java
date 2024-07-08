package core.basesyntax;

import java.util.Random;

public class GeometricFigureSupplier {
    private Random random = new Random();

    public GeometricFigure getRandomFigure() {
        int index = random.nextInt(0, GeometricFigure.values().length);
        return GeometricFigure.values()[index];
    }
}
