package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    Square square = new Square();
    RightTriangle rightTriangle = new RightTriangle();
    Circle circle = new Circle();
    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    Rectangle rectangle = new Rectangle();
    Figure [] figures = new Figure[] {square, rightTriangle, circle, isoscelesTrapezoid, rectangle};
    Random random = new Random();

    public Figure getRandomFigure() {
        return  null;
    }

    public Figure getDefaultFigure(){
        return new Circle("white", 10);
    }
}
