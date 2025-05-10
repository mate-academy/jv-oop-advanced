package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Circle {
    public Figure getRandomFigure() {
        int indexOfFigure = new Random().nextInt(5);

        switch (indexOfFigure) {
            case 1:
                Square square = new Square();
                break;
            case 2:
                Circle circle = new Circle();
                break;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                break;
            case 4:
                Rectangle rectangle = new Rectangle();
                break;
            case 5:
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
                break;
            default:
                return null;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        return null;
    }

}
