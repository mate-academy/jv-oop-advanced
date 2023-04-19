package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
            case 1 :
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 2 :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
            case 3 :
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            default :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }
}
