package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureInstance;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FigureInstance.values().length);
        FigureInstance figureName = FigureInstance.values()[randomFigureIndex];

        switch (figureName) {
            case CIRCLE -> {
                return new Circle(random.nextInt(0, 20),
                        colorSupplier.getRandomColor());
            }
            case SQUARE -> {
                return new Square(random.nextInt(0, 20),
                        colorSupplier.getRandomColor());
            }
            case RECTANGLE -> {
                return new Rectangle(random.nextInt(0, 20),
                        random.nextInt(0, 20),
                        colorSupplier.getRandomColor());
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(random.nextInt(0, 20),
                        random.nextInt(0, 20),
                        colorSupplier.getRandomColor());
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(random.nextInt(0, 20),
                        random.nextInt(0, 20),
                        random.nextInt(0, 20),
                        colorSupplier.getRandomColor());
            }
        }
        return null;
    }
    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

}
