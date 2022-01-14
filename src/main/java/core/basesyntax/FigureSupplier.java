package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure circle = new Circle();
    private Figure square = new Square();
    private Figure rectangle = new Rectangle();
    private Figure rightTriangle = new RightTriangle();
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid();

    private Figure[] figures = new Figure[]
            {circle, square, rectangle, rightTriangle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Circle circleDefault = new Circle(10);
        circleDefault.setName("circle");
        circleDefault.setColor("white");
        return circleDefault;
    }
}
