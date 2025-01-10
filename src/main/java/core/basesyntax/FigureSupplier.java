package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int multiplier = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        final int figureType = random.nextInt(5);

        switch (figureType) {
            case 0: return new Square(color,
                    random.nextDouble() * 10);
            case 1: return new Rectangle(color,
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            case 2: return new RightTriangle(color,
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            case 3: return new Circle(color,
                    random.nextDouble() * 10);
            case 4: return new IsoscelesTrapezoid(color,
                    random.nextDouble() * 10,
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final int radius = 10;
        final Color circleColor = Color.WHITE;
        return new Circle(circleColor, radius);
    }
}
