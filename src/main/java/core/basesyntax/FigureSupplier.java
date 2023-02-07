package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int radius = 10;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5) + 1;
        switch (figureType) {
            case 1: {
                return new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(50));
            }
            case 2: {
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(50), random.nextInt(50));
            }
            case 3: {
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(50), random.nextInt(50));
            }
            case 4: {
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(50), random.nextInt(50), random.nextInt(50));
            }
            default: {
                return new Square(new ColorSupplier().getRandomColor(), random.nextInt(50));
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), radius);
    }
}
