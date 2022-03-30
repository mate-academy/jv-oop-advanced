package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;

import java.util.Random;

public class FigureSupplier {
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int generateRandomFigure = random.nextInt(5);
        switch (generateRandomFigure) {
            case 0:
                return new Square(random.nextInt(100),
                        colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(100),
                        random.nextInt(100),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(100),
                        random.nextInt(100),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(100),
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(100),
                        random.nextInt(100), random.nextInt(50),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(33, "green");
    }
}
