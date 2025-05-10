package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int indexFigure = new Random().nextInt(AllFigure.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (AllFigure.values()[indexFigure]) {
            case ISOSCELES_TRAPEZOID:
                int firstLeg = getRandomValue();
                int secondLeg = getRandomValue();
                int height = getRandomValue();
                String colorI = colorSupplier.getRandomColor();
                IsoscelesTrapezoid trapezoid
                        = new IsoscelesTrapezoid(colorI,firstLeg,secondLeg,height);
                return trapezoid;
            case CIRCLE:
                int radius = getRandomValue();
                String colorC = colorSupplier.getRandomColor();
                Circle circle = new Circle(colorC,radius);
                return circle;
            case RIGHT_THIANGLE:
                int firstSide = getRandomValue();
                int secondSide = getRandomValue();
                String colorR = colorSupplier.getRandomColor();
                RightTriangle rightTriangle = new RightTriangle(colorR,firstSide,secondSide);
                return rightTriangle;
            case RECTANGLE:
                int side1 = getRandomValue();
                int side2 = getRandomValue();
                String colorRec = colorSupplier.getRandomColor();
                Rectangle rectangle = new Rectangle(colorRec,side1,side2);
                return rectangle;
            case SQUARE:
                int side = getRandomValue();
                String colorS = colorSupplier.getRandomColor();
                Square square = new Square(colorS,side);
                return square;
            default:
                break;
        }
        return null;
    }

    private int getRandomValue() {
        return new Random().nextInt(100) + 1;
    }

    public Circle getDefaultFigure() {
        Circle circle = new Circle("WHITE",10);
        return circle;
    }
}
