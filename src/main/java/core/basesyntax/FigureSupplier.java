package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS_CIRCLE = 6;
    private static final int COUNT_FIGURES = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        switch (random.nextInt(COUNT_FIGURES)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            case 2:
                int deg = random.nextInt(90) + 1;
                return new RightTriangle(deg, 90 - deg,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(50),
                        colorSupplier.getRandomColor());
            case 4:
            default:
                int a = random.nextInt(100) + 1;
                int b = random.nextInt(100) + 1;
                int c = random.nextInt(100);
                while (c + c <= a + b) {
                    c = random.nextInt(100);
                }
                return new IsoscelesTrapezoid(a, b, c,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_CIRCLE, Color.WHITE);
    }
}
