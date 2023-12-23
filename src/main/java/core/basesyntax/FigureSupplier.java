package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 5;
    private static final int MIN = 1;
    private Random random = new Random();

    public Figure getRandomFigure() {

        Figure randomFigure = null;

        int randomType = random.nextInt(MAX - MIN + MIN) + MIN;
        switch (randomType) {
            case 1 -> randomFigure = new Circle();
            case 2 -> randomFigure = new Rectangle();
            case 3 -> randomFigure = new Square();
            case 4 -> randomFigure = new IsoscelesTrapezoid();
            case 5 -> randomFigure = new RightTriangle();
            default -> getDefaultFigure();
        }
        randomFigure.generateRandomParameters();
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.color = "WHITE";
        circle.setRadius(10);
        circle.name = "Circle";
        return circle;
    }
}
