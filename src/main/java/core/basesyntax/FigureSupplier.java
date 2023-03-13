package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        Colors color = ColorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return new Square(color,
                        (random.nextInt(20)));
            case 1:
                return new Rectangle(color,
                        (random.nextInt(20)),
                        (random.nextInt(20)));
            case 2:
                return new RightTriangle(color,
                        (random.nextDouble() * 10 + 1),
                        (random.nextDouble() * 10 + 1));
            case 3:
                return new Circle(color,
                        (random.nextInt(10)));
            case 4:
                return new IsoscelesTrapezoid(color,
                        (random.nextDouble() * 10 + 1),
                        (random.nextDouble() * 10 + 1),
                        (random.nextDouble() * 10 + 1));
            default:
                return null;
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(Colors.white, 10);
    }
}

