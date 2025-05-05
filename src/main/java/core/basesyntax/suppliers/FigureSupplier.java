package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 9;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureIndex = new Random().nextInt(Figures.values().length);
        Figures figures = Figures.values()[figureIndex];
        Random randomSize = new Random();
        Color color = colorSupplier.getRandomColor();

        return switch (figures) {
            case Circle -> new Circle(randomSize.nextInt(MAX_SIZE) + 1, color);
            case IsoscelesTrapezoid -> new IsoscelesTrapezoid(randomSize.nextInt(MAX_SIZE) + 1,
                    randomSize.nextInt(MAX_SIZE) + 1, randomSize.nextInt(MAX_SIZE) + 1,
                                color);
            case Rectangle -> new Rectangle(randomSize.nextInt(9) + 1,
                    randomSize.nextInt(MAX_SIZE) + 1, color);
            case RightTriangle -> new RightTriangle(randomSize.nextInt(MAX_SIZE) + 1,
                    randomSize.nextInt(MAX_SIZE) + 1, color);
            case Square -> new Square(randomSize.nextInt(MAX_SIZE) + 1, color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
