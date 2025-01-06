package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure[] getRandomFigure() {

     Figure [] figures = new Figure[]{new Square(random.nextInt(FIGURE_COUNT)),
        //square.color = getRandomColor();
        //square.name = "Square ";
        //square.area = square.getArea();

         new Rectangle(random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT)),
        //rectangle.color = getRandomColor();
        //rectangle.name = "Rectangle ";
        //rectangle.area = rectangle.getArea();

        new RightTriangle(random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT)),
        //rightTriangle.color = getRandomColor();
        //rightTriangle.name = "Right Triangle ";
        //rightTriangle.area = rightTriangle.getArea();

         new IsoscelesTrapezoid(random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT), random.nextInt(FIGURE_COUNT))
        //isoscelesTrapezoid.color = getRandomColor();
        //isoscelesTrapezoid.name = "Isosceles Trapezoid ";
        //isoscelesTrapezoid.area = isoscelesTrapezoid.getArea();

};
     return figures;
    }
    public Figure getDefaultFigure() {
        Figure circle = new Circle();
        circle.color = "WHITE";
        circle.name = "Circle ";
        return circle;
    }


}
