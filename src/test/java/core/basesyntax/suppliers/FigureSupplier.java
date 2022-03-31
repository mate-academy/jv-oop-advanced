package core.basesyntax.suppliers;

import core.basesyntax.enam.FigureList;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.figures.*;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (FigureList.values()[random.nextInt(FigureList.values().length)].toString()) {
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            case "RIGHT_TRIANGLE":
                return new RightTriangle();
            case "CIRCLE":
                return new Circle();
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure(String name) {
        switch (name) {
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            case "RIGHT_TRIANGLE":
                return new RightTriangle();
            case "CIRCLE":
                return new Circle();
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid();
            default:
                return null;
        }
    }
}

