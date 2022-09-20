package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(GeometricFigure.values().length);
        GeometricFigure randomFigure = GeometricFigure.values()[index];
        switch (randomFigure) {
            case ISOSCELES_TRAPEZOID:
                String colorTrapezoid = colorSupplier.getRandomColor();
                int height = random.nextInt(BOUND);
                int firstBasis = random.nextInt(BOUND);
                int secondBasis = random.nextInt(BOUND);
                figure = new IsoscelesTrapezoid(colorTrapezoid, height, firstBasis, secondBasis);
                break;
            case CIRCLE:
                String colorCircle = colorSupplier.getRandomColor();
                int radius = random.nextInt(BOUND);
                figure = new Circle(colorCircle, radius);
                break;
            case SQUARE:
                String colorSquare = colorSupplier.getRandomColor();
                int side = random.nextInt(BOUND);
                figure = new Square(colorSquare, side);
                break;
            case RECTANGLE:
                String colorRectangle = colorSupplier.getRandomColor();
                int firstSide = random.nextInt(BOUND);
                int secondSide = random.nextInt(BOUND);
                figure = new Rectangle(colorRectangle, firstSide, secondSide);
                break;
            default:
                String colorTriangle = colorSupplier.getRandomColor();
                int heightTriangle = random.nextInt(BOUND);
                int basisTriangle = random.nextInt(BOUND);
                figure = new RightTriangle(colorTriangle, heightTriangle, basisTriangle);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        figure = new Circle(Color.WHITE.toString(), 10);
        return figure;
    }
}
