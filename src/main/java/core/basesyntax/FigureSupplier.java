package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class FigureSupplier {
    public static final int TOTAL_AMOUNT_OF_FIGURES = 5;
    public static final String DEFAULT_FIGURE_COLOR = Colors.WHITE.name().toLowerCase();
    public static final double DEFAULT_FIGURE_SIZE = 10;
    public static final int MAX_FIGURE_SIZE = 100;
    public static final double MIN_DECIMAL_PART = 0.001;
    private final DecimalFormat df = new DecimalFormat("#.###");
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomSize() {
        double randomNumber = random.nextDouble() * MAX_FIGURE_SIZE + MIN_DECIMAL_PART;
        String formattedRandomNumber = df.format(randomNumber);

        return Double.parseDouble(formattedRandomNumber);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double side = getRandomSize();
        return new Square(color, side);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double width = getRandomSize();
        double length = getRandomSize();
        return new Rectangle(color, width, length);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = getRandomSize();
        double secondLeg = getRandomSize();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double radius = getRandomSize();
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double topSide = getRandomSize();
        double bottomSide = getRandomSize();
        double height = getRandomSize();
        return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(TOTAL_AMOUNT_OF_FIGURES);

        switch (randomFigureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_SIZE);
    }
}
