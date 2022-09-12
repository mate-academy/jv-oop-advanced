package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public int getRandomFigure() {
        int randomValue = new Random().nextInt(11);
        return randomValue + 5;
    }

    public Figure getDefaultFigure() {
        Circle defCircle = new Circle();
        defCircle.setRadius(10);
        defCircle.setColor("white");
        return defCircle;
    }
}
