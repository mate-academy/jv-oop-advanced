package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        String figureName = Figures.values()[random.nextInt(Figures.values().length)].toString();

        if (figureName == "Rectangle") {
            return new RectangleStrategy().getFigure();
        }
        if (figureName == "Square") {
            return new SquareStrategy().getFigure();
        }
        if (figureName == "RightTriangle") {
            return new RightTriangleStrategy().getFigure();
        }
        if (figureName == "IsoscelesTrapezoid") {
            return new IsoscelesTrapezoidStrategy().getFigure();
        }
        if (figureName == "Circle") {
            return new CircleStrategy().getFigure();
        }

        return getDefaultFigure();
    }

    public static Figure getDefaultFigure() {
        Figure defaultCircle = new Circle(10);
        defaultCircle.setColor("WHITE");
        return defaultCircle;
    }
}
