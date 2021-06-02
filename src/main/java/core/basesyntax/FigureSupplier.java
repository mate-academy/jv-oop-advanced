package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random randomNumber = new Random();
        switch (randomNumber.nextInt(4)) {
            case 0:
                return new Square(randomNumber.nextInt(100));
            case 1:
                return new RightTriangle(randomNumber.nextInt(100),
                        randomNumber.nextInt(100));
            case 2:
                return new Rectangle(randomNumber.nextInt(100),
                        randomNumber.nextInt(100));
            default:
                return new IsoscelesTrapezoid(randomNumber.nextInt(100),
                        randomNumber.nextInt(100),
                        randomNumber.nextInt(100),
                        randomNumber.nextInt(100));
        }
    }

}
