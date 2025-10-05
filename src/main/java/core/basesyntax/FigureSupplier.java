package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        double a = randomSize();
        double b = randomSize();
        double c = randomSize();

        switch (type) {
            case 0:
                return new Square(color, a);
            case 1:
                return new Rectangle(color, a, b);
            case 2:
                return new RightTriangle(color, a, b);
            case 3:
                return new Circle(color, a);
            case 4:
            default:
                double base1 = a;
                double base2 = b;
                if (base1 == base2) {
                    base2 += 1.0;
                }
                double height = c;
                return new IsoscelesTrapezoid(color, base1, base2, height);
        }
    }

    private double randomSize() {
        return 1.0 + random.nextDouble() * 19.0;
    }
}
