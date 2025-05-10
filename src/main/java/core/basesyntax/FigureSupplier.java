package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int INDEX_OF_FIGURE = 4;
    public static final int DEFOULT_RADIUS = 10;

    public static final Color DEFOULT_COLOR = Color.valueOf("WHITE");
    public static final int MAX_VALUE = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(INDEX_OF_FIGURE);
        switch (randomFigure) {
            case 0 :
                return circle();
            case 1 :
                return rectangle();
            case 2 :
                return square();
            case 3 :
                return rightTriangle();
            case 4 :
                return isoscelesTrapezoid();
            default:
                return getDefoltCircle();

        }
    }

    public IsoscelesTrapezoid isoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    public RightTriangle rightTriangle() {
        return new RightTriangle(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    public Square square() {
        return new Square(random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    public Rectangle rectangle() {
        return new Rectangle(random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    public Figure circle() {
        return new Circle(random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    public Circle getDefoltCircle() {
        return new Circle(DEFOULT_RADIUS, DEFOULT_COLOR);
    }
}
