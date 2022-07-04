package core.basesyntax;
import core.basesyntax.figures.*;

public class FigureSupplier extends Figure {
    public static void main(String[] args) {
        Figure[] figureArrayTest = new Figure[6];
        for (int i = 0; i < figureArrayTest.length; i++) {
            figureArrayTest[i] = getRandomFigure();

        }
        figureArrayTest[0] = getRandomFigure();
        figureArrayTest[1] = getRandomFigure();
        figureArrayTest[2] = getRandomFigure();
        figureArrayTest[3] = getDefaultFigure();
        figureArrayTest[4] = getDefaultFigure();
        figureArrayTest[5] = getDefaultFigure();
    }

    public static Figure getDefaultFigure() {
        Circle circleDefault = new Circle(10);
        circleDefault.setColor("WHITE");
        return circleDefault;
    }

    public static Figure getRandomFigure() {
        Circle circle = new Circle();
        circle.getColor();
        circle.getRadius();
        circle.getArea();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.getColor();
        rectangle.getSideA();
        rectangle.getSideB();
        Square square = new Square();
        square.getSide();
        square.getColor();
        square.getArea();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.getHeight();
        isoscelesTrapezoid.getSideA();
        isoscelesTrapezoid.getSideB();
        isoscelesTrapezoid.getColor();
        isoscelesTrapezoid.getArea();
        RightTriangle triangle = new RightTriangle();
        Figure[] arraysOfFigures =  {circle, rectangle, square, isoscelesTrapezoid, triangle};
        int index = (int)(Math.random() * arraysOfFigures.length);
        return arraysOfFigures[index] = getRandomFigure();
    }
}