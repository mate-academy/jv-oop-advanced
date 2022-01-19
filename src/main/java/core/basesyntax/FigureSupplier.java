package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int indexFigure = new Random().nextInt(AllFigure.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (AllFigure.values()[indexFigure]) {
            case ISOSCELES_TRAPEZOID:
                int firstLeg = new Random().nextInt(100)+1;
                int secondLeg = new Random().nextInt(100)+1;
                int height = new Random().nextInt(100)+1;
                String colorI = colorSupplier.getRandomColor();
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(colorI,firstLeg,secondLeg,height);
                return trapezoid;
            case CIRCLE:
                int radius = new Random().nextInt(100)+1;
                String colorC = colorSupplier.getRandomColor();
                Circle circle = new Circle(colorC,radius);
                return circle;
            case RIGHT_THIANGLE:
                int firstSide = new Random().nextInt(100)+1;
                int secondSide = new Random().nextInt(100)+1;
                String colorR = colorSupplier.getRandomColor();
                RightTriangle rightTriangle = new RightTriangle(colorR,firstSide,secondSide);
                return rightTriangle;
            case RECTANGLE:
                int side1 = new Random().nextInt(100)+1;
                int side2 = new Random().nextInt(100)+1;
                String colorRec = colorSupplier.getRandomColor();
                Rectangle rectangle = new Rectangle(colorRec,side1,side2);
                return rectangle;
            case SQUARE:
                int side = new Random().nextInt(100)+1;
                String colorS = colorSupplier.getRandomColor();
                Square square = new Square(colorS,side);
                return square;
        }
        return null;
    }
    public Circle getDefaultFigure(){
        Circle circle = new Circle("WHITE",10);
        return circle;
    }

}
