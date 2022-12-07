package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIG_NUMBERS = 5;
    public static final int FIGURE_SIZE = 20;
    public static final int CIRCLE_Radius = 10;
    public static final String CIRCLE_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(CIRCLE_COLOR);
        circle.setRadius(CIRCLE_Radius);
        return circle;
    }

    public Figure getRandomFigure() {
        int lot = random.nextInt(FIG_NUMBERS) + 1;
        switch (lot) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomTriangle();
            default:
                return getRandomSquare();
        }
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(FIGURE_SIZE);
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setTopSide(random.nextInt(FIGURE_SIZE) + 1);
        isoscelesTrapezoid.setBottomSide(isoscelesTrapezoid.getTopSide() + 1);
        isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_SIZE) + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideOne(random.nextInt(FIGURE_SIZE) + 1);
        rectangle.setSideTwo(random.nextInt(FIGURE_SIZE) + 1);
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(FIGURE_SIZE) + 1);
        rightTriangle.setSecondLeg(random.nextInt(FIGURE_SIZE) + 1);
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(FIGURE_SIZE) + 1);
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

}
