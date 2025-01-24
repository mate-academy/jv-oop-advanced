package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(color, random.nextDouble() * 10);
            case 1:
                return new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
            case 3:
                return new Circle(color, random.nextDouble() * 10);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

