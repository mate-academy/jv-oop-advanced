package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = this.random.nextInt(6);
        int firstValue = this.random.nextInt(100);
        int secondValue = this.random.nextInt(100);
        int thirdValue = this.random.nextInt(100);
        switch (index) {
            case 1:
                figure = new Circle(firstValue);
                break;
            case 2:
                figure = new Rectangle(firstValue,secondValue);
                break;
            case 3:
                figure = new RightTriangle(firstValue,secondValue);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(firstValue,secondValue,thirdValue);
                break;
            case 5:
                figure = new Square(firstValue);
                break;
            default:
                figure = new RightTriangle(firstValue,secondValue);
                break;
        }
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Colors.White.name());
        return circle;
    }
}
