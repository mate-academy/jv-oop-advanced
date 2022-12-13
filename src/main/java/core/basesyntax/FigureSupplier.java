package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int number;
        number = random.nextInt(5);
        switch (number) {
            case 1: {
                return new Circle();
            }
            case 2: {
                return new Rectangle();
            }
            case 3: {
                return new Square();
            }
            case 4: {
                return new RightTriangle();
            }
            case 5: {
                return new IsoscelesTrapezoid();
            }
            default:
                return new Circle();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
