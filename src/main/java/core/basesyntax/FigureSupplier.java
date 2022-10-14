package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int TOTAL_FIGURE_TYPES = 5;
    private static final int FIGURE_SIDE_MAX_SIZE = 55;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int figureTypeIndex = random.nextInt(TOTAL_FIGURE_TYPES);
        switch (figureTypeIndex) {
            case 0:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                figure = square;
                break;
            case 1:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setSideA(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                rectangle.setSideB(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                figure = rectangle;
                break;
            case 2:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                rightTriangle.setSecondLeg(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                figure = rightTriangle;
                break;
            case 3:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                figure = circle;
                break;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setBottomSide(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                isoscelesTrapezoid.setUpperSide(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_SIDE_MAX_SIZE));
                figure = isoscelesTrapezoid;
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("white");
        circle.setRadius(10);
        return circle;
    }
}
