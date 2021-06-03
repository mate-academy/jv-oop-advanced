package behavior;

import figures.Circle;
import figures.IsoscelesTrapezoid;
import figures.Rectangle;
import figures.RightTriangle;
import figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_LIMIT = 10;
    private static final int NUMBER_OF_FIGURES = 6;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), "Circle",
                       new Random().nextInt(UPPER_LIMIT));
            case 2:
                return new Square(colorSupplier.getRandomColor(), "Square",
                       new Random().nextInt(UPPER_LIMIT));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), "IsoscelessTrapezoid",
                       new Random().nextInt(UPPER_LIMIT),
                       new Random().nextInt(UPPER_LIMIT),
                       new Random().nextInt(UPPER_LIMIT));
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(), "Rectangle",
                       new Random().nextInt(UPPER_LIMIT),
                       new Random().nextInt(UPPER_LIMIT));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), "RightTriangle",
                       new Random().nextInt(UPPER_LIMIT),
                       new Random().nextInt(UPPER_LIMIT),
                       new Random().nextInt(UPPER_LIMIT));
        }
    }
}

