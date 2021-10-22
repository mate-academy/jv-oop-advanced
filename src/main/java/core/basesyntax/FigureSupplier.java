package core.basesyntax;

public class FigureSupplier {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure result;
        int getFigureNumber = (int) (Math.random() * 5);
        switch (getFigureNumber) {
            case 0:
                result = new Square(colorSupplier.getRandomColor(), randomDouble());
                break;
            case 1:
                result = new Circle(colorSupplier.getRandomColor(), randomDouble());
                break;
            case 2:
                result = new Rectangle(colorSupplier.getRandomColor(),
                        randomDouble(), randomDouble());
                break;
            case 3:
                result = new RightTriangle(colorSupplier.getRandomColor(),
                        randomDouble(), randomDouble());
                break;
            default:
                result = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomDouble(), randomDouble(), randomDouble());
        }
        return result;
    }

    private double randomDouble() {
        return Math.random() * 101;
    }
}
