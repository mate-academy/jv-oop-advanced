package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_NUMBER = 100;
    private final Color defaultColor = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Circle getRandomCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color,firstLeg,secondLeg);
    }

    private Rectangle getRandomRectangle() {
        int side1 = random.nextInt(MAX_NUMBER);
        int side2 = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color,side1,side2);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int high = random.nextInt(MAX_NUMBER);
        int base1 = random.nextInt(MAX_NUMBER);
        int base2 = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color,high,base1,base2);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        final int defaultRadius = 10;
        return new Circle(defaultColor, defaultRadius);
    }
}
