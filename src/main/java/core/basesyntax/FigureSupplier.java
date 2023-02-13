package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final double DEFAULT_VALUE = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(){
        int figureIndex = random.nextInt(Color.values().length);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure(){
        return new Circle(DEFAULT_VALUE, DEFAULT_COLOR);
    }
    public Circle getRandomCircle() {
        return new Circle(random.nextInt(BOUND), colorSupplier.randomColor());
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(BOUND),
                colorSupplier.randomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(BOUND),
                random.nextInt(BOUND),
                colorSupplier.randomColor());
    }

    public Right_triangle getRandomRightTriangle() {
        return new Right_triangle(random.nextInt(BOUND), random.nextInt(BOUND), colorSupplier.randomColor());
    }

    public Isosceles_trapezoid getRandomIsoscelesTrapezoid() {
        return new Isosceles_trapezoid(random.nextInt(BOUND),
                random.nextInt(BOUND),
                random.nextInt(BOUND),
                colorSupplier.randomColor());
    }
}
