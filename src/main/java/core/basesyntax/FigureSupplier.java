package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int indexFigure = new Random().nextInt(AllFigure.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (AllFigure.values()[indexFigure]) {
            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
                trapezoid.setFirstLeg(new Random().nextInt(99)+1);
                trapezoid.setSecondLeg(new Random().nextInt(99)+1);
                trapezoid.setHeight(new Random().nextInt(99)+1);
                trapezoid.setColor(colorSupplier.getRandomColor());
                trapezoid.getArea();
                return trapezoid;
            case CIRCLE:
                Circle circle = new Circle();
                circle.setRadius(new Random().nextInt(99)+1);
                circle.setColor(colorSupplier.getRandomColor());
                circle.getArea();
                return circle;
            case RIGHT_THIANGLE:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(new Random().nextInt(99)+1);
                rightTriangle.setSecondLeg(new Random().nextInt(99)+1);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.getArea();
                return rightTriangle;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstLeg(new Random().nextInt(99)+1);
                rectangle.setSecondLeg(new Random().nextInt(99)+1);
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.getArea();
                return rectangle;
            case SQUARE :
                Square square = new Square();
                square.setFirstLeg(new Random().nextInt(99)+1);
                square.setColor(colorSupplier.getRandomColor());
                square.getArea();
                return square;
        }
        return null;
    }
    public Circle getDefaultFigure(){
        Circle circle = new Circle();
        circle.setColor("WHITE");
        circle.setRadius(10);
        return circle;
    }

}
