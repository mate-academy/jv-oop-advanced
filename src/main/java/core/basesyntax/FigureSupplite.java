package core.basesyntax;

import java.util.Random;

public class FigureSupplite {
    public static final Random random = new Random();

    public static Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        Color color = ColorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color, random.nextDouble());
            case 1:
                return new Circle(color, random.nextDouble());
            case 2:
                return new IsoscelesTrapezoid(color, random.nextDouble());
            case 3:
                return new Rectangle(color, random.nextDouble());
            default:
                return new RightTriangle(color, random.nextDouble());
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
