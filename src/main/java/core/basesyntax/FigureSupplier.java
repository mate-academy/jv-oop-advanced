package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int TOTAL_NUMBER_OF_FIGURES = 5;
    // numbers of figures
    private static final int SIDE_SIZE = 13;
    private static final int DEF_RADIUS = 10;
    private static final Circle defaultCircle = new Circle(Colors.WHITE, DEF_RADIUS);
    private final Random random = new Random();
    private final ColorSupplier colSup = new ColorSupplier();

    public Figure getRandomFigure() {
        int randFigure = random.nextInt(TOTAL_NUMBER_OF_FIGURES);
        switch (randFigure) {
            case 0 :
                return circle();
            case 1 :
                return isoscelesTrapezoid();
            case 2 :
                return rectangle();
            case 3 :
                return rightTriangle();
            case 4 :
                return square();
            default:
                return getDefaultFigure();
        }
    }

    public Square square() {
        return new Square(colSup.getRandomColor(), random.nextInt(SIDE_SIZE) + 1);
    }

    public Rectangle rectangle() {
        return new Rectangle(colSup.getRandomColor(),
                random.nextInt(SIDE_SIZE) + 1, random.nextInt(SIDE_SIZE) + 1);
    }

    public RightTriangle rightTriangle() {
        return new RightTriangle(colSup.getRandomColor(),
                random.nextInt(SIDE_SIZE) + 1, random.nextInt(SIDE_SIZE) + 1);
    }

    public Circle circle() {
        return new Circle(colSup.getRandomColor(), random.nextInt(SIDE_SIZE) + 1);
    }

    public IsoscelesTrapezoid isoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colSup.getRandomColor(),
                random.nextInt(SIDE_SIZE) + 1, random.nextInt(SIDE_SIZE) + 1,
                random.nextInt(SIDE_SIZE) + 1);
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }
}
