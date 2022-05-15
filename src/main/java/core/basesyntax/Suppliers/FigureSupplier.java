package core.basesyntax.Suppliers;

import core.basesyntax.EnumClass.NameOfFigure;
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
