package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        final int figureType = random.nextInt(5);

        String color = colorSupplier.getRandomColor();
        int sideOrRadius = random.nextInt() * 10;

        switch (figureType) {
            case 0:
                return new Square(color, sideOrRadius);
            case 1:
                return new Circle(color, sideOrRadius);
            case 2:
                double width = random.nextDouble() * 10;
                double height = random.nextDouble() * 10;
                return new Rectangle(color, (int) width, (int) height);
            case 3:
                double firstLeg = random.nextDouble() * 10;
                double secondLeg = random.nextDouble() * 10;
                return new RightTriangle(color, (int) secondLeg, (int) firstLeg);
            case 4:
                int topBase = random.nextInt() * 10;
                int bottomBase = random.nextInt() * 10;
                int heightTrapezoid = random.nextInt() * 10;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, heightTrapezoid);

            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
