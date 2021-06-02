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
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(new Random().nextInt(UPPER_LIMIT));
            case 2:
                return new Square(new Random().nextInt(UPPER_LIMIT));
            case 3:
                return new IsoscelesTrapezoid(new Random()
                        .nextInt(UPPER_LIMIT),
                        new Random().nextInt(UPPER_LIMIT),
                        new Random().nextInt(UPPER_LIMIT));
            case 4:
                return new Rectangle(new Random().nextInt(UPPER_LIMIT),
                        new Random().nextInt(UPPER_LIMIT));
            case 5:
                return new RightTriangle(new Random().nextInt(UPPER_LIMIT),
                        new Random().nextInt(UPPER_LIMIT),
                        new Random().nextInt(UPPER_LIMIT));
            default:
                return new Rectangle(1, 1);
        }
    }
}

