package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public Circle getRandomCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        Colors color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Square getRandomSquare() {
        int side = random.nextInt(MAX_NUMBER);
        Colors color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    public RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        Colors color = colorSupplier.getRandomColor();
        return new RightTriangle(color,firstLeg,secondLeg);
    }

    public Rectangle getRandomRectangle() {
        int side1 = random.nextInt(MAX_NUMBER);
        int side2 = random.nextInt(MAX_NUMBER);
        Colors color = colorSupplier.getRandomColor();
        return new Rectangle(color,side1,side2);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int high = random.nextInt(MAX_NUMBER);
        int base1 = random.nextInt(MAX_NUMBER);
        int base2 = random.nextInt(MAX_NUMBER);
        Colors color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color,high,base1,base2);
    }

    public Figure getRandomFigure(){
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
    public Figure getDefaultFigure(){
        Colors DEFAULT_COLOR = Colors.white;
        int DEFAULT_RADIUS = 10;
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
