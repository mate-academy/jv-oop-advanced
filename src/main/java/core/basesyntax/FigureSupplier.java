package core.basesyntax;

import core.basesyntax.lists.FiguresList;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FiguresList.values().length;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = "WHITE";
    private Random random = new Random();

    public Figures getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        String randomFigureName = String.valueOf(FiguresList.values()[index]);
        String color = new ColorSupplier().getRandomColor();

        Figures result = null;
        switch (randomFigureName) {
            case ("RECTANGLE"):
                int longSide = random.nextInt(100);
                int shortSide = random.nextInt(100);
                Figures rectangle = new Rectangle(longSide, shortSide, color);
                result = rectangle;
                break;

            case ("SQUARE"):
                int side = random.nextInt(100);
                Figures square = new Square(side, color);
                result = square;
                break;

            case ("TRIANGLE"):
                int firstLeg = random.nextInt(100);
                int secondLeg = random.nextInt(100);
                Figures rightTriangle = new RightTriangle(firstLeg, secondLeg, color);
                result = rightTriangle;
                break;

            case ("CIRCLE"):
                int radius = random.nextInt(100);
                Figures circle = new Circle(radius, color);
                result = circle;
                break;

            default:
                int longSide1 = random.nextInt(100);
                int shortSide1 = random.nextInt(100);
                int height = random.nextInt(100);
                Figures isoscelesTrapezoid = new IsoscelesTrapezoid(longSide1,
                        shortSide1, height, color);
                result = isoscelesTrapezoid;
                break;
        }
        return result;
    }

    public Figures getDefaultFigure() {
        Circle circle = new Circle(CIRCLE_RADIUS, CIRCLE_COLOR);
        return circle;
    }
}

