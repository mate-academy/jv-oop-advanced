package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Shape;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    /** Checkstyle plugin throws an error on the constant name with more than two capital
     *  letters in the row. So I had to use camelCase for the constants */
    private final int numberLimit = 45;
    private final int coefficient = 2;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Shape getRandomFigure() {

        Shape[] shapes = new Shape[]{
                new Circle(colorSupplier.getRandomColor(),random.nextInt(numberLimit)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),getRandomSide(),
                        getRandomSide() * coefficient, getRandomSide()),
                new Rectangle(colorSupplier.getRandomColor(),getRandomSide(),getRandomSide()),
                new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide()),
                new Square(colorSupplier.getRandomColor(), getRandomSide()),
                new Circle(colorSupplier.getRandomColor(), getRandomSide())
        };

        int randomIndex = random.nextInt(shapes.length);
        return shapes[randomIndex];
    }

    public int getRandomSide() {
        return random.nextInt(numberLimit);
    }

    public Shape getDefaultFigure() {
        return new Circle("white", 10);
    }
}
