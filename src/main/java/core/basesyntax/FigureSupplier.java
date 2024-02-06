package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        double randomNum = random.nextInt(5);

        switch ((int) randomNum) {
            case 0:
                return new Circle(new ColorSupplier()
                        .getRandomColor(), randomNum);
            case 1:
                return new Square(new ColorSupplier()
                        .getRandomColor(), randomNum);
            case 2:
                return new Rectangle(new ColorSupplier()
                        .getRandomColor(), randomNum, randomNum);
            case 3:
                return new RightTriangle(new ColorSupplier()
                        .getRandomColor(), randomNum);
            case 4:
                return new IsoscelesTrapezoid(new ColorSupplier()
                        .getRandomColor(), randomNum, randomNum);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
