package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FiguresList;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSuppliers {
    private static final int MAX_LENGTH = 30;
    private static final int DEFAULT_RADIUS = 30;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FiguresList.values().length);
        String figureName = FiguresList.values()[index].name();
        switch (figureName) {
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(),
                        getRandomSide());
            case "TRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomSide());
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
            default:
                break;
        }
        return getDefaultFigure();
    }

    private int getRandomSide() {
        return random.nextInt(MAX_LENGTH);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
