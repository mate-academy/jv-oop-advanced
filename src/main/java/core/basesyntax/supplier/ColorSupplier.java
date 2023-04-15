package core.basesyntax.supplier;

import core.basesyntax.figures.*;
import core.basesyntax.model.Color;
import java.util.Random;


public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].name();
    }

    public static class FigureSupplier{

        public String getRandomColor() {
            return getRandomColor();
        }

        private static final int MAX_NUMBER = 100;
        private static final int FIGURES_NUMBER = 5;
        private static final int DEFAULT_RADIUS = 10;
        private static final String DEFAULT_COLOR = Color.WHITE.toString();
        private final ColorSupplier colorSupplier = new ColorSupplier();
        private final Random random = new Random();

        public Figure getRandomFigureAndColor() {

            switch (random.nextInt(FIGURES_NUMBER)) {
                case 0:
                    return getRandomCircle();
                case 1:
                    return getRandomIsoscelesTrapezoid();
                case 2:
                    return getRandomRectangle();
                case 3:
                    return getRandomRightTriangle();
                default:
                    getRandomSquare();
            }
            return getDefaultFigure();
        }

        public Figure getDefaultFigure() {
            return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        }

        private Figure getRandomIsoscelesTrapezoid() {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble());
        }

        private Figure getRandomRectangle() {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble(),
                    random.nextDouble());
        }

        private Figure getRandomRightTriangle() {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(),
                    random.nextDouble());
        }

        private Figure getRandomSquare() {
            return new Square(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER));
        }

        private Figure getRandomCircle() {
            return new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER));
        }
    }
}
