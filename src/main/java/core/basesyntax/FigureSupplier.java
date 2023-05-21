
package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 100;
    private final Random random = new Random();
    public Figure getRandomFigure() {
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = this.random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 1:
                figure = getCircle();
                break;
            case 2:
                figure = getRectangle();
                break;
            case 3:
                figure = getRightTriangle();
                break;
            case 4:
                figure = getIsoscelesTrapezoid();
                break;
            case 5:
                figure = getSquare();
                break;
            default:
                figure = getRightTriangle();
                break;
        }
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getCircle() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        return new Circle(firstValue);
    }

    public Figure getRectangle() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int secondValue = this.random.nextInt(MAX_RANDOM_VALUE);
        return new Rectangle(firstValue,secondValue);
    }

    public Figure getIsoscelesTrapezoid() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int secondValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int thirdValue = this.random.nextInt(MAX_RANDOM_VALUE);
        return new IsoscelesTrapezoid(firstValue,secondValue,thirdValue);
    }

    public Figure getRightTriangle() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        int secondValue = this.random.nextInt(MAX_RANDOM_VALUE);
        return new RightTriangle(firstValue,secondValue);
    }

    public Figure getSquare() {
        int firstValue = this.random.nextInt(MAX_RANDOM_VALUE);
        return new Square(firstValue);
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Colors.White.name());
        return circle;
    }
}
