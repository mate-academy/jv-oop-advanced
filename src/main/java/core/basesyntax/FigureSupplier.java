package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = "WHITE";
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, CIRCLE_COLOR.toLowerCase());
    }

    public Figure getRandomFigure() {
        double side = new Random().nextInt(10) + 1;
        double length = new Random().nextInt(10) + 1;
        double width = new Random().nextInt(10) + 1;
        double firstLeg = new Random().nextInt(10) + 1;
        double secondLeg = new Random().nextInt(10) + 1;
        double topSide = new Random().nextInt(10) + 1;
        double bottomSide = new Random().nextInt(10) + 1;
        double height = new Random().nextInt(10) + 1;
        double radius = new Random().nextInt(10) + 1;

        String randomColor = colorSupplier.getRandomColor();
        int figureType = new Random().nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(side, randomColor);
            case 1:
                return new Rectangle(length, width, randomColor);
            case 2:
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            case 3:
                return new Circle(radius, randomColor);
            case 4:
                return new IsoscelesTrapezoid(topSide, bottomSide, height, randomColor);
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }
}
