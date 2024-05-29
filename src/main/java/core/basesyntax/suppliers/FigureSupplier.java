package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {

    private static final double RANDOM_BOUND = 100.00;

    public Figure getRandomFigure() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        double randomNumber = ColorSupplier.random.nextDouble(RANDOM_BOUND);

        Figure[] figures = new Figure[]{new Circle(randomColor, randomNumber),
                new Rectangle(randomColor, randomNumber, randomNumber),
                new Square(randomColor, randomNumber),
                new RightTriangle(randomColor, randomNumber, randomNumber),
                new IsoscelesTrapezoid(randomColor, randomNumber, randomNumber, randomNumber)
        };

        Figure randomFigure = figures[(int) (Math.random() * figures.length)];
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10.0);
    }
}
