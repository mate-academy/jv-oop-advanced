package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return new Square(random.nextInt(10) + 1, ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        ColorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(10) + 1, ColorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        random.nextInt(10) + 1, ColorSupplier.getRandomColor());
            default:
                return new Circle(10, "white");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
