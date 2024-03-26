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
                int radius = random.nextInt(1, MAX_NUMBERS);
                return new Circle(colorSupplier.getRandomColor(), radius);

            case 1:
                int largeBase = random.nextInt(1, MAX_NUMBERS);
                int smallerBase = largeBase / 2;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        largeBase, smallerBase,
                        random.nextInt(1, MAX_NUMBERS));
            case 2:
                int width = random.nextInt(1, MAX_NUMBERS);
                int height = random.nextInt(1, MAX_NUMBERS);
                return new Rectangle(colorSupplier.getRandomColor(),
                        width, height);
            case 3:
                int sideRectangle = random.nextInt(1, MAX_NUMBERS);
                return new RightTriangle(colorSupplier.getRandomColor(),
                        sideRectangle);
            case 4:
                int sideSquare = random.nextInt(1, MAX_NUMBERS);
                return new Square(colorSupplier.getRandomColor(),
                        sideSquare);
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
