package core.basesyntax;

import java.util.Random;

public class GeometricFigureSupplier {
    public GeometricFigure getRandomFigure() {
        int index = new Random().nextInt(0, GeometricFigure.values().length);
        return GeometricFigure.values()[index];
    }
}
