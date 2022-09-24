package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier extends Figure {

    public static final String NAME = "CIRCLE";
    public static final String COLOR = "WHITE";
    public static final double RADIUS = 10;
    private static Random random ;
    private double firstline;
    private double secondline;
    private double thirdline;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {

    }

    public Figure getDefaultFigure() {
        System.out.println("Figure= " + NAME + ", Color= "
                + COLOR + ", radius= " + RADIUS);
        return new Circle(NAME, COLOR, RADIUS);
    }

    public double getRandomFigure() {
        int rundomFigura = random.nextInt(5);
        colorSupplier = new ColorSupplier();
        Figure figure;
        firstline = new Random().nextInt(50);
        secondline = new Random().nextInt(50);
        thirdline = new Random().nextInt(50);

        switch (rundomFigura) {
            case 1:
                figure = new Circle(DifferentFigure.CIRCLE.name(),
                        colorSupplier.getRandomColor(), firstline);
                figure.draw();
                return figure.getArea();
            case 2:
                figure = new Square(DifferentFigure.SQUARE.name(),
                        colorSupplier.getRandomColor(), firstline);
                figure.draw();
                return figure.getArea();
            case 3:
                figure = new Rectangle(DifferentFigure.RECTANGLE.name(),
                        colorSupplier.getRandomColor(), firstline, secondline);
                figure.draw();
                return figure.getArea();
            case 4:
                figure = new RightTriangle(DifferentFigure.RIGHTTRIANGLE.name(),
                        colorSupplier.getRandomColor(), firstline, secondline);
                figure.draw();
                return figure.getArea();
            case 5:
                figure = new IsoscelesTrapezoid(DifferentFigure.ISOSCELESTRAPEZOID.name(),
                        colorSupplier.getRandomColor(), firstline, secondline, thirdline);
                figure.draw();
                return figure.getArea();
            default:
                getDefaultFigure();
        }
        return rundomFigura;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
