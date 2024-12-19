package core.basesyntax.classes.functional;

import core.basesyntax.classes.figures.Circle;
import core.basesyntax.classes.figures.Figure;
import core.basesyntax.classes.figures.IsoscelesTrapezoid;
import core.basesyntax.classes.figures.Rectangle;
import core.basesyntax.classes.figures.RightTriangle;
import core.basesyntax.classes.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIDE_SIZE = 12;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        int figureToCreate = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureToCreate) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        new Random().nextInt(MAX_SIDE_SIZE));
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_SIZE), random.nextInt(MAX_SIDE_SIZE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_SIZE), random.nextInt(MAX_SIDE_SIZE));
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIDE_SIZE));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIDE_SIZE), random.nextInt(MAX_SIDE_SIZE),
                        random.nextInt(MAX_SIDE_SIZE));
            default:
                return new Circle("white", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

