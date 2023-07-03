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
    private static final int DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FiguresList.values().length);
        String figureName = FiguresList.values()[index].name();
        Figure figure;
        switch (figureName) {
            case "SQUARE":
                figure = new Square(colorSupplier.getRandomColor(),
                        getRandomSide());
                break;
            case "TRIANGLE":
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
                break;
            case "ISOSCELES_TRAPEZOID":
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
                break;
            case "CIRCLE":
                figure = new Circle(colorSupplier.getRandomColor(),
                        getRandomSide());
                break;
            case "RECTANGLE":
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    private int getRandomSide() {
        return random.nextInt(MAX_LENGTH);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
