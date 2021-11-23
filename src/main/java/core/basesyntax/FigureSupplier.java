package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;

    public Figures getRandomFigure() {
        RandomLine randomLine = new RandomLine();
        ColorSupplier colors = new ColorSupplier();
        for (int i = 0; i < 3; i++) {
            int random = new Random().nextInt(MAX_RANDOM_NUMBER);
            switch (random) {
                case 1:
                    IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(
                            randomLine.getRandomSide(),
                            randomLine.getRandomSide(),
                            colors.getRandomColor(),
                            randomLine.getRandomSide());
                    return trapezoid;
                case 2:
                    Circle circle = new Circle(randomLine.getRandomSide(), colors.getRandomColor());
                    return circle;
                case 3:
                    Square square = new Square(randomLine.getRandomSide(), colors.getRandomColor());
                    return square;
                case 4:
                    Rectangle rectangle = new Rectangle(randomLine.getRandomSide(),
                            randomLine.getRandomSide(),
                            colors.getRandomColor());
                    return rectangle;
                case 5:
                    RightTriangle rightTriangle = new RightTriangle(randomLine.getRandomSide(),
                            randomLine.getRandomSide(),
                            colors.getRandomColor());
                    return rightTriangle;
                default:
                    Circle circleDefault = new Circle(DEFAULT_RADIUS, colors.getRandomColor());
                    return circleDefault;
            }
        }
        return null;
    }
}

