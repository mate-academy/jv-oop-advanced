package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int QUANITY_OF_TYPES = 5;
    private String color = ColorSupplier.getRandomColor();

    public Figure getRandomFigure() {

        Random random = new Random();
        int figureType = random.nextInt(QUANITY_OF_TYPES);

        switch (figureType) {
            case 0:
                return new Circle(color,
                        (double) Math.round(random.nextDouble() * 100) / 100);
            case 1:
                return new IsoscelesTrapezoid(color,
                        (double) Math.round(random.nextDouble() * 100) / 100,
                        (double) Math.round(random.nextDouble() * 100) / 100,
                        (double) Math.round(random.nextDouble() * 100) / 100);
            case 2:
                return new Rectangle(color,
                        (double) Math.round(random.nextDouble() * 100) / 100,
                        (double) Math.round(random.nextDouble() * 100) / 100);
            case 3:
                return new RightTriangle(color,
                        (double) Math.round(random.nextDouble() * 100) / 100,
                        (double) Math.round(random.nextDouble() * 100) / 100);
            case 4:
                return new Square(color,
                        (double) Math.round(random.nextDouble() * 100) / 100);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
