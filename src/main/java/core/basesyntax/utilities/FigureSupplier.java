package core.basesyntax.utilities;

import core.basesyntax.figureClasses.*;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure returnFigure = null;
        switch (random.nextInt(5)) {
            case (0):
                returnFigure = new Circle(colorSupplier.getRandomColor(), random);
                break;
            case (1):
                returnFigure = new Square(colorSupplier.getRandomColor(), random);
                break;
            case (2):
                returnFigure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random);
                break;
            case (3):
                returnFigure = new Rectangle(colorSupplier.getRandomColor(), random);
                break;
            case (4):
                returnFigure = new RightTriangle(colorSupplier.getRandomColor(), random);
        }
        return returnFigure;
    }
}
