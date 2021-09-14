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
                result = new Square(getRandomColor(), randomDouble());
                break;
            case 1:
                result = new Circle(getRandomColor(), randomDouble());
                break;
            case 2:
                result = new Rectangle(getRandomColor(), randomDouble(), randomDouble());
                break;
            case 3:
                result = new RightTriangle(getRandomColor(), randomDouble(), randomDouble());
                break;
            default:

                result = new IsoscelesTrapezoid(getRandomColor(),
                        randomDouble(), randomDouble(), randomDouble());
        }
        return result;
    }
}




