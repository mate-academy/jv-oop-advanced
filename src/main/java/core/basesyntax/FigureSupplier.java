package core.basesyntax;

public class FigureSupplier extends ColorSupplier {

    private double randomDouble() {
        return Math.random() * 101;
    }

    public Figure getRandomFigure() {
        Figure result;
        int getFigureNumber = (int) (Math.random() * 5);
        switch (getFigureNumber) {
            case 0:
                result = new Square(randomDouble());
                break;
            case 1:
                result = new Circle(randomDouble());
                break;
            case 2:
                result = new Rectangle(randomDouble(), randomDouble());
                break;
            case 3:
                result = new RightTriangle(randomDouble(), randomDouble());
                break;
            default:
                result = new IsoscelesTrapezoid(randomDouble(), randomDouble(), randomDouble());
        }
        return result;
    }
}




