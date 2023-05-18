package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private final Random random = new Random();
    public Figure getRandomFigure() {
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = this.random.nextInt(6);
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
        int firstValue = this.random.nextInt(100);
        return new Circle(firstValue);
    }

    public Figure getRectangle() {
        int firstValue  = this.random.nextInt(100);
        int secondValue = this.random.nextInt(100);
        return new Rectangle(firstValue,secondValue);
    }

    public Figure getIsoscelesTrapezoid() {
        int firstValue = this.random.nextInt(100);
        int secondValue = this.random.nextInt(100);
        int thirdValue = this.random.nextInt(100);
        return new IsoscelesTrapezoid(firstValue,secondValue,thirdValue);
    }

    public Figure getRightTriangle() {
        int firstValue  = this.random.nextInt(100);
        int secondValue = this.random.nextInt(100);
        return new RightTriangle(firstValue,secondValue);
    }

    public Figure getSquare() {
        int firstValue = this.random.nextInt(100);
        return new Square(firstValue);
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Colors.White.name());
        return circle;
    }
}