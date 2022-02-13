package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Square square = new Square();
    RightTriangle rightTriangle = new RightTriangle();
    Circle circle = new Circle();
    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    Rectangle rectangle = new Rectangle();
    Figure [] figures = new Figure[] {square, rightTriangle, circle, isoscelesTrapezoid, rectangle};

    public Figure getRandomFigure() {
       return  figures[(int)Math.floor(Math.random() * figures.length)];
    }

    public Figure getDefaultFigure(){
        return new Circle("white", 10);
    }
}
