package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier{
    public static final String NAME = "CIRCLE";
    public static final String COLOR = "WHITE";
    public static final double RADIUS = 10;
    private static final Random random = new Random();

    public FigureSupplier() {

    }

    public Figure getDefaultFigure() {
        System.out.println("Figure= " + NAME + ", Color= "
                + COLOR + ", radius= " + RADIUS);
        return new Circle(COLOR, RADIUS);
    }

    public Figure getRandomFigure() {
        int rundomFigura = random.nextInt(5);
        double firstline = new Random().nextInt(50);
        double secondline = new Random().nextInt(50);
        double thirdline = new Random().nextInt(50);
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figure = new FigureSupplier();


        switch (rundomFigura) {
            case 0:
                return getDefaultFigure();
            case 1:
                new Circle(colorSupplier.getRandomColor(), firstline).draw();
                new Circle(colorSupplier.getRandomColor(), firstline).getArea();

                return null;
            case 2:
                Figure square = new Square(colorSupplier.getRandomColor(), firstline);
                square.getArea();
                square.draw();
                return square;
            case 3:
                Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), firstline, secondline);
                rectangle.getArea();
                rectangle.draw();
                return rectangle;
            case 4:
                Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), firstline, secondline);
                rightTriangle.getArea();
                rightTriangle.draw();
                return rightTriangle;
            case 5:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstline, secondline, thirdline);
                 isoscelesTrapezoid.getArea();
                 isoscelesTrapezoid.draw();
                return isoscelesTrapezoid;
            default:
                getDefaultFigure();
        }
        return getDefaultFigure();
    }
}
