package core.basesyntax;

import java.util.Random;

public interface FigureSupplier {
    Circle circle = new Circle();
    Random random = new Random();

    Figure getRandomFigure();

    default Figure getDefaultFigure() {
        circle.setColor(Colors.WHITE.toString());
        circle.setRadius(10);
        return circle;
    }
}
