package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private int number;
    private final Random random = new Random();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Figure getRandomFigure() {
        number = random.nextInt(5);
        switch (number) {
            case 1: {
                return new Circle(random);
            }
            case 2: {
                return new Rectangle(random);
            }
            case 3: {
                return new Square(random);
            }
            case 4: {
                return new RightTriangle(random);
            }
            case 5: {
                return new IsoscelesTrapezoid(random);
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("White");
        return circle;
    }
}
