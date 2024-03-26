package core.basesyntax.service;

import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.geometric.Circle;
import core.basesyntax.figures.geometric.IsoscelesTrapezoid;
import core.basesyntax.figures.geometric.Rectangle;
import core.basesyntax.figures.geometric.RightTriangle;
import core.basesyntax.figures.geometric.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int MAX_NUMBERS = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(MAX_FIGURES);

        switch (choice) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_NUMBERS));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_NUMBERS),
                        random.nextInt(1, MAX_NUMBERS),
                        random.nextInt(1, MAX_NUMBERS));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_NUMBERS),
                        random.nextInt(1, MAX_NUMBERS));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_NUMBERS));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(1, MAX_NUMBERS));
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
