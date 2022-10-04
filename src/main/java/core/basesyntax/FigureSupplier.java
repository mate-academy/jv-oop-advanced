package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    final double DEFAULRADIUS = 10;
    private ColorSupplier figureColor = new ColorSupplier();

    private double getRandomDouble() {
        return new Random().nextInt();
    }

    public Figure getRandomFigure() {
        String randomColor = figureColor.getRandomColor();
        int randomIndex = new Random().nextInt(4);
        switch (randomIndex) {
            case 0:
                return new Circle(randomColor, getRandomDouble());
            case 1:
                return new Square(randomColor, getRandomDouble());
            case 3:
                return new Rectangle(randomColor, getRandomDouble(), getRandomDouble());
            case 4:
                return new IsoscelesTrapezoid(randomColor, getRandomDouble(), getRandomDouble());
            case 5:
                return new RightTriangle(randomColor, getRandomDouble(), getRandomDouble());
            default: return new Circle(figureColor.getRandomColor(), getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULRADIUS);
    }
}
