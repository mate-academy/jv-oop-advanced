package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    private Circle circle() {
        return new Circle(random.nextInt(100));
    }

    private IsoscelesTrapezoid isoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                random.nextInt(100), random.nextInt(100), random.nextInt(100));
    }

    private Rectangle rectangle() {
        return new Rectangle(random.nextInt(100), random.nextInt(100));
    }

    private RightTriangle rightTriangle() {
        return new RightTriangle(random.nextInt(100), random.nextInt(100));
    }

    private Square square() {
        return new Square(random.nextInt(100));
    }

    public Figure getRandomFigure() {
        int figureRandom = random.nextInt(5);
        switch (figureRandom) {
            case 0:
                return circle();
            case 1:
                return isoscelesTrapezoid();
            case 2:
                return rectangle();
            case 3:
                return rightTriangle();
            default:
                return square();
        }
    }
}
