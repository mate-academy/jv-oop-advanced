package core.basesyntax;

public class FigureGenerator {
    public static Figure getFigure() {
        int numberOfFigure = (int)(Math.random() * 5) + 1;
        switch (numberOfFigure) {
            case 1 :
                return Square.generateFigure();
            case 2 :
                return Rectangle.generateFigure();
            case 3 :
                return Circle.generateFigure();
            case 4 :
                return IsoscelesTrapezoid.generateFigure();
            case 5 :
                return RightTriangle.generateFigure();
            default:
                return null;
        }

    }

}
