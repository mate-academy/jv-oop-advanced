package core.basesyntax.suppliers;

import core.basesyntax.enums.NameOfFigure;
import java.util.Random;

public class FigureSupplier {

    public String getRandomFigure() {
        int nameIndex = new Random().nextInt(NameOfFigure.values().length);
        return String.valueOf(NameOfFigure.values()[nameIndex]);
    }

    public String getDefaultFigure() {
        return String.valueOf(NameOfFigure.CIRCLE);
    }
}
