package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int figureChoice = random.nextInt(5);
        switch (figureChoice) {
            case 0 :
                return Circle.getRandomCircle();
            case 1 :
                return Rectangle.getRandomRectangle();
            case 2 :
                return Square.getRandomSquare();
            case 3 :
                return RightTriangle.getRandomRightTriangle();
            case 4 :
                return IsoscelesTrapezoid.getRandomIsoscelesTrapezoid();
            default :
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
