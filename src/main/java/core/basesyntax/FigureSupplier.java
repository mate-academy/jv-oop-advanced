package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        Colors randomColors = Colors.values()[index];
        return randomColors.toString();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        Figures randomFigure = Figures.values()[index];

        switch (randomFigure) {
            case Circle:
                return new Circle(getRandomColor(), random.nextInt(1, 10));
            case Square:
                return new Square(getRandomColor(), random.nextInt(1, 10));
            case Rectangle:
                return new Rectangle(getRandomColor(), random.nextInt(1, 10),
                        random.nextInt(1, 10));
            case RightTriangle:
                return new RightTriangle(getRandomColor(), random.nextInt(1, 10),
                        random.nextInt(1, 10));
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(getRandomColor(), random.nextInt(1, 10),
                        random.nextInt(1, 10), random.nextInt(1, 10));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
