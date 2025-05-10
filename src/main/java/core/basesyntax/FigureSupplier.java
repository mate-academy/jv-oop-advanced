package core.basesyntax;

import java.util.Random;


public class FigureSupplier {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Figure getRandomFigure() {
        int figureRandom = random.nextInt(5);
        String color = ColorSupplier.getRandomColor();
        switch (figureRandom) {
            case 4:
                return new RightTriangle(color, random.nextDouble(), random.nextDouble());
            case 3:
                return new Square(color, random.nextDouble());
            case 2:
                return new IsoscelesTrapezoid(color, random.nextDouble(), random.nextDouble(), random.nextDouble());
            case 1:
                return new Rectangle(color, random.nextDouble(), random.nextDouble());
            case 0:
                return new Circle(color, random.nextDouble());
            default:
                return getDefaultFigure();

        }


    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
