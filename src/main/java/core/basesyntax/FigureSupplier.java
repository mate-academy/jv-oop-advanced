package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int figureType = new Random().nextInt(5);
        double randomLeg1 = 1 + new Random().nextDouble() * 10;
        double randomLeg2 = 1 + new Random().nextDouble() * 10;
        double randomLeg3 = 1 + new Random().nextDouble() * 10;
        switch (figureType) {
            case 0:
                return new Square(randomLeg1, ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(randomLeg1, randomLeg2,
                        ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(randomLeg1, randomLeg2,
                        ColorSupplier.getRandomColor());
            case 3:
                return new Circle(randomLeg1,
                        ColorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(randomLeg1, randomLeg2, randomLeg3,
                        ColorSupplier.getRandomColor());
            default:
                return null;

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, ColorSupplier.Color.WHITE.toString());
    }
}
