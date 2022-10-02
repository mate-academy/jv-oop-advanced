package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor().toLowerCase();
        int figureNumber = random.nextInt(FIGURE_NUMBER);
        if (figureNumber == 0) {
            int randomRadius = random.nextInt(BOUND);
            Figure circle = new Circle(randomRadius);
            circle.setColor(randomColor);
            return circle;
        } else if (figureNumber == 1) {
            int randomBase = random.nextInt(BOUND);
            int randomTop = random.nextInt(BOUND);
            int randomHeight = random.nextInt(BOUND);
            Figure trapezoid = new IsoscelesTrapezoid(randomBase, randomTop, randomHeight);
            trapezoid.setColor(randomColor);
            return trapezoid;
        } else if (figureNumber == 2) {
            int randomLength = random.nextInt(BOUND);
            int randomWidth = random.nextInt(BOUND);
            Figure rectangle = new Rectangle(randomLength, randomWidth);
            rectangle.setColor(randomColor);
            return rectangle;
        } else if (figureNumber == 3) {
            int randomFirstLeg = random.nextInt(BOUND);
            int randomSecondLeg = random.nextInt(BOUND);
            Figure triangle = new RightTriangle(randomFirstLeg, randomSecondLeg);
            triangle.setColor(randomColor);
            return triangle;
        } else {
            int randomSide = random.nextInt(BOUND);
            Figure square = new Square(randomSide);
            square.setColor(randomColor);
            return square;
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS);
        defaultFigure.setColor(DEFAULT_COLOR);
        return defaultFigure;
    }
}
