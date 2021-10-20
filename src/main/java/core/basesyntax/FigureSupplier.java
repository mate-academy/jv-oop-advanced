package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        if (getGeometricFigure().equals(GeometricFigure.CIRCLE)) {
            return new Circle(colorSupplier.getRandomColor(), getRandomLength());
        }
        if (getGeometricFigure().equals(GeometricFigure.SQUARE)) {
            return new Square(colorSupplier.getRandomColor(), getRandomLength());
        }
        if (getGeometricFigure().equals(GeometricFigure.RECTANGLE)) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomLength(), getRandomLength());
        }
        if (getGeometricFigure().equals(GeometricFigure.RIGHT_TRIANGLE)) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomLength(), getRandomLength());
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomLength(),getRandomLength(),getRandomLength());
    }

    public int getRandomLength() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public GeometricFigure getGeometricFigure() {
        GeometricFigure[] figures = GeometricFigure.values();
        return figures[new Random().nextInt(GeometricFigure.values().length)];
    }

    public enum GeometricFigure {
        CIRCLE,
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        ISOSCELES_TRAPEZOID
    }
}
