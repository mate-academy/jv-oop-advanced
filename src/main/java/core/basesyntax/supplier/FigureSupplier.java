package core.basesyntax.supplier;

import core.basesyntax.model.*;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        // According to the number generated generateRandomFigure
        // a certain figure will be created
        // 0 - square
        // 1 - rectangle
        // 2 - right triangle
        // 3 - circle
        // 4 - isosceles trapezoid
        int generateRandomFigure = random.nextInt(5);
        if (generateRandomFigure == 0) {
            return new Square(random.nextInt(100),
                    colorSupplier.getRandomColor());
        } else if (generateRandomFigure == 1) {
            return new Rectangle(random.nextInt(100),
                    random.nextInt(100), colorSupplier.getRandomColor());
        } else if (generateRandomFigure == 2) {
            return new RightTriangle(random.nextInt(100),
                    random.nextInt(100), colorSupplier.getRandomColor());
        } else if (generateRandomFigure == 3) {
            return new Circle(random.nextInt(100),
                    colorSupplier.getRandomColor());
        } else {
            return new IsoscelesTrapezoid(random.nextInt(100),
                    random.nextInt(100), random.nextInt(50),
                    colorSupplier.getRandomColor());
        }
    }
}
