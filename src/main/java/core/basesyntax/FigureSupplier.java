package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        GeometricFigure figure = new GeometricFigureSupplier().getRandomFigure();
        ColorSupplier colorSupplier = new ColorSupplier();

        if (figure == GeometricFigure.CIRCLE) {
            return new Circle(random.nextInt(), colorSupplier.getRandomColor().toLowerCase());
        }
        if (figure == GeometricFigure.RECTANGLE) {
            return new Rectangle(random.nextInt(), random.nextInt(),
                    colorSupplier.getRandomColor().toLowerCase());
        }
        if (figure == GeometricFigure.ISOSCELES_TRAPEZOID) {
            return new IsoscelesTrapezoid(random.nextInt(), random.nextInt(),
                    random.nextInt(), colorSupplier.getRandomColor().toLowerCase());
        }
        if (figure == GeometricFigure.SQUARE) {
            return new Square(random.nextInt(), colorSupplier.getRandomColor().toLowerCase());
        }
        return new RightTriangle(random.nextInt(), random.nextInt(),
                colorSupplier.getRandomColor().toLowerCase());
    }

    public Figure getDefaultFigure() {
        Color color = Color.WHITE;
        return new Circle(10, color.toString().toLowerCase());
    }
}
