package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PARAMETERS = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 1:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(FIGURE_PARAMETERS));
                figure = circle;
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setSideA(random.nextInt(FIGURE_PARAMETERS));
                rectangle.setSideB(random.nextInt(FIGURE_PARAMETERS));
                figure = rectangle;
                break;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(FIGURE_PARAMETERS));
                rightTriangle.setSecondLeg(random.nextInt(FIGURE_PARAMETERS));
                figure = rightTriangle;
                break;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_PARAMETERS));
                isoscelesTrapezoid.setLowerSide(random.nextInt(FIGURE_PARAMETERS));
                isoscelesTrapezoid.setUpperSide(random.nextInt(FIGURE_PARAMETERS));
                figure = isoscelesTrapezoid;
                break;
            default:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(FIGURE_PARAMETERS));
                figure = square;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white.toString());
    }
}
