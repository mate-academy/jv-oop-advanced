package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);

        return circle;
    }

    public Figure getRandomFigure() {

        switch (random.nextInt(5)) {
            case 1: {
                return new Circle(random.nextInt());
            }
            case 2: {
                return new IsoscelesTrapezoid(random.nextInt(), random.nextInt());
            }
            case 3: {
                return new Rectangle(random.nextInt(), random.nextInt());
            }
            case 4: {
                return new RightTriangle(random.nextInt(), random.nextInt());
            }
            case 5: {
                return new Square(random.nextInt());
            }
            default: {
                return getDefaultFigure();
            }
        }
    }
}
