package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Drawable getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                double side = 1 + random.nextDouble() * 10;
                return new Square(color, side);
            case 1:
                double width = 1 + random.nextDouble() * 10;
                double height = 1 + random.nextDouble() * 10;
                return new Rectangle(color, width, height);
            case 2:
                double firstLeg = 1 + random.nextDouble() * 10;
                double secondLeg = 1 + random.nextDouble() * 10;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double radius = 1 + random.nextDouble() * 10;
                return new Circle(color, radius);
            case 4:
                double base1 = 1 + random.nextDouble() * 10;
                double base2 = 1 + random.nextDouble() * 10;
                double heightTrap = 1 + random.nextDouble() * 10;
                return new IsoscelesTrapezoid(color, base1, base2, heightTrap);
            default:
                return getDefaultFigure();
        }
    }

    public Drawable getDefaultFigure() {
        return new Circle("white", 10);
    }
}
