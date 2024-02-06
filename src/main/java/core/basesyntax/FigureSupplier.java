package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        double randomNumber = random.nextInt(5);

        switch ((int) randomNumber) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(), randomNumber);
            case 1:
                return new Square(new ColorSupplier().getRandomColor(), randomNumber);
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(), randomNumber, randomNumber);
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(), randomNumber);
            case 4:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), randomNumber, randomNumber);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
