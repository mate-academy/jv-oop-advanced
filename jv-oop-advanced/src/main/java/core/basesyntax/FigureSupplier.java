package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public enum FigureConstants {
        CIRCLE_RADIUS(10),
        CIRCLE_COLOR("WHITE"),
        FIGURES_QUANTITY(5);

        private final Object value;

        FigureConstants(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getDefaultFigure() {
        return new Circle((int) FigureConstants.CIRCLE_RADIUS.getValue(),
                (String) FigureConstants.CIRCLE_COLOR.getValue());
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt((int) FigureConstants.FIGURES_QUANTITY.getValue());

        switch (randomFigure) {
            case 0:
                return new Square(15, randomColor);
            case 1:
                return new Rectangle(10, 15, randomColor);
            case 2:
                return new RightTriangle(4, 8, randomColor);
            case 3:
                return new Circle(20, randomColor);
            case 4:
                return new IsoscelesTrapezoid(10, 20, 15, randomColor);
            default:
                return getDefaultFigure();
        }
    }
}
