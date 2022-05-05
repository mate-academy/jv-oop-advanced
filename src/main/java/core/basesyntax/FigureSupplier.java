package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Figure figure;
        switch (new Random().nextInt(5)) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(),
                        new Random().nextInt(100) + 1);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        new Random().nextInt(100) + 1,
                        new Random().nextInt(100) + 1);
            case 2:
                int deg = new Random().nextInt(90) + 1;
                return new RightTriangle(deg, 90 - deg,
                        new Random().nextInt(100),
                        ColorSupplier.getRandomColor());
            case 3:
                return new Circle(new Random().nextInt(50),
                        ColorSupplier.getRandomColor());
            case 4:
                int a = new Random().nextInt(100) + 1;
                int b = new Random().nextInt(100) + 1;
                int c = new Random().nextInt(100);
                while (c + c <= a + b) {
                    c = new Random().nextInt(100);
                }
                return new IsoscelesTrapezoid(a, b, c,
                        ColorSupplier.getRandomColor());
            default:
                break;
        }
        return null;
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, Colors.white);
    }
}
