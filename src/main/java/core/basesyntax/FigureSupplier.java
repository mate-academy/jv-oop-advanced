package core.basesyntax;

import core.basesyntax.enums.Color;
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
        Figure[] arrayOfFigures = new Figure[5];
        arrayOfFigures[0] = new Square(random.nextInt(0, 50),
                colorSupplier.getRandomColor());
        arrayOfFigures[1] = new Rectangle(random.nextInt(0, 50),
                random.nextInt(0,50),
                colorSupplier.getRandomColor());
        arrayOfFigures[2] = new RightTriangle(random.nextInt(0, 50),
                random.nextInt(0,50),
                colorSupplier.getRandomColor());
        arrayOfFigures[3] = new Circle(random.nextInt(0, 50),
                colorSupplier.getRandomColor());
        arrayOfFigures[4] = new IsoscelesTrapezoid(random.nextInt(0, 50),
                random.nextInt(0, 50),
                random.nextInt(0, 50),
                colorSupplier.getRandomColor());
        for (Figure figure : arrayOfFigures) {
            figure.findArea();
        }
        return arrayOfFigures[random.nextInt(0, 4)];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

}
