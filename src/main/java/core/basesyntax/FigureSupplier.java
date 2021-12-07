package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomInrex = random.nextInt(5);
        switch (randomInrex) {
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new IsoscelesTapezoid();
            case 3 : return new RightTriangle();
            default: return new Rectangle();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
