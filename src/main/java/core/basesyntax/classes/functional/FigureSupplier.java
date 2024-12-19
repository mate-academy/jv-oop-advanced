package core.basesyntax.classes.functional;

import core.basesyntax.classes.figures.Circle;
import core.basesyntax.classes.figures.Figure;
import core.basesyntax.classes.figures.IsoscelesTrapezoid;
import core.basesyntax.classes.figures.Rectangle;
import core.basesyntax.classes.figures.RightTriangle;
import core.basesyntax.classes.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        final int numberOfFigures = 5;
        final int maxSideSize = 12;

        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        int figureToCreate = random.nextInt(numberOfFigures);
        switch (figureToCreate) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        new Random().nextInt(maxSideSize));
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSideSize), random.nextInt(maxSideSize));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSideSize), random.nextInt(maxSideSize));
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(maxSideSize));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxSideSize), random.nextInt(maxSideSize),
                        random.nextInt(maxSideSize));
            default:
                return new Circle("white", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

