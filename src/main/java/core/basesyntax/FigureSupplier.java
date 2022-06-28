package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public FigureType getRundomFigure() {
        int index = new Random().nextInt(FigureType.values().length);
        return FigureType.values()[index];
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE, 10);
        return figure;
    }
}
