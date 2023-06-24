package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int COUNT_OF_FIGURE = 5; //Count of different figure classes
    public static final int MAX_BOUND = 1000;
    public static final int DEFAULT_RADIUS = 10;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        /*
        typeOfFigure : 0 - IsoscelesTrapezoid,
        1 - Square,
        2 - RightTriangle,
        3 - Circle,
        4 - Rectangle
         */
        int typeOfFigure = random.nextInt(COUNT_OF_FIGURE);
        switch (typeOfFigure) {
            case 0 :
                return getRandomIsoscelesTrapezoid();
            case 1 :
                return getRandomSquare();
            case 2 :
                return getRandomRightTriangle();
            case 3 :
                return getRandomCircle();
            case 4 :
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
    }
}
