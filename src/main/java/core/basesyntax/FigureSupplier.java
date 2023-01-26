package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_MAX = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures [] figures = Figures.values();
        int index = random.nextInt(figures.length);
        switch (figures[index]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
        }
        return null;
    }

    private Circle getRandomCircle() {
        Color color = randomColor.getRandomColor();
        double radius = random.nextInt(NUMBER_MAX);
        return new Circle(color,radius);
    }

    private Square getRandomSquare() {
        Color color = randomColor.getRandomColor();
        double side = random.nextInt(NUMBER_MAX);
        return new Square(color,side);
    }

    private Rectangle getRandomRectangle() {
        Color color = randomColor.getRandomColor();
        double sideOne = random.nextInt(NUMBER_MAX);
        double sideTwo = random.nextInt(NUMBER_MAX);
        return new Rectangle(color,sideOne,sideTwo);
    }

    private RightTriangle getRandomRightTriangle() {
        Color color = randomColor.getRandomColor();
        double side = random.nextInt(NUMBER_MAX);
        double bisector = random.nextInt(NUMBER_MAX);
        return new RightTriangle(color,side,bisector);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Color color = randomColor.getRandomColor();
        double baseLower = random.nextInt(NUMBER_MAX);
        double baseUpper = random.nextInt(NUMBER_MAX);
        double height = random.nextInt(NUMBER_MAX);
        return new IsoscelesTrapezoid(color,baseLower,baseUpper,height);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
