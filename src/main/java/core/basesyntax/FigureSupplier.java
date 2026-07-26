package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int TYPES_OF_FIGURES = 5;
    private static final int MAX = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(TYPES_OF_FIGURES); // 0-4 для 5 типів фігур

        switch (figureType) {
            case 0:
                String colorSquare = colorSupplier.getRandomColor();
                double sideSquare = random.nextInt(MAX);
                return new Square(colorSquare, sideSquare);
            case 1:
                String colorRec = colorSupplier.getRandomColor();
                double lengRec = random.nextInt(MAX);
                double withRec = random.nextInt(MAX);
                return new Rectangle(colorRec, lengRec, withRec);
            case 2:
                String colorTriangle = colorSupplier.getRandomColor();
                double firstLegTriangle = random.nextInt(MAX);
                double secondLegTriangle = random.nextInt(MAX);
                return new RightTriangle(colorTriangle, firstLegTriangle, secondLegTriangle);
            case 3:
                String colorCircle = colorSupplier.getRandomColor();
                double radiusCircle = random.nextInt(MAX);
                return new Circle(colorCircle, radiusCircle);
            case 4:
                String colorIsoscelesTrapezoid = colorSupplier.getRandomColor();
                double firstIsoscelesTrapezoid = random.nextInt(MAX);
                double secondIsoscelesTrapezoid = random.nextInt(MAX);
                double heightIsoscelesTrapezoid = random.nextInt(MAX);
                return new IsoscelesTrapezoid(colorIsoscelesTrapezoid,
                        firstIsoscelesTrapezoid, secondIsoscelesTrapezoid,
                        heightIsoscelesTrapezoid);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
