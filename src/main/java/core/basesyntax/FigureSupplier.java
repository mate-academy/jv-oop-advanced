package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case (1): {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
            }
            case (2): {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20), random.nextInt(20));
            }
            case (3): {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
            }
            case (4): {
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
            }
            default: {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
            }
        }
    }
}
