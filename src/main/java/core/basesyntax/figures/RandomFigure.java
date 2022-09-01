package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figuresupplier.DifferentFigure;
import core.basesyntax.figuresupplier.FigureSupplier;
import java.util.Random;

public class RandomFigure extends Figure {
    private double firstline;
    private double secondline;
    private double thirdline;
    private FigureSupplier supplierFigure;
    private ColorSupplier colorSupplier;

    public RandomFigure() {
    }

    @Override
    public double getArea() {
        supplierFigure = new FigureSupplier();
        colorSupplier = new ColorSupplier();
        Figure figure;
        firstline = new Random().nextInt(50);
        secondline = new Random().nextInt(50);
        thirdline = new Random().nextInt(50);

        switch (supplierFigure.getRandomFigura()) {
            case CIRCLE:
                figure = new Circle(DifferentFigure.CIRCLE.name(),
                        colorSupplier.getRandomColor(), firstline);
                figure.drow();
                return figure.getArea();
            case SQUARE:
                figure = new Square(DifferentFigure.SQUARE.name(),
                        colorSupplier.getRandomColor(), firstline);
                figure.drow();
                return figure.getArea();
            case RECTANGLE:
                figure = new Rectangle(DifferentFigure.RECTANGLE.name(),
                        colorSupplier.getRandomColor(), firstline, secondline);
                figure.drow();
                return figure.getArea();
            case RIGHTTRIANGLE:
                figure = new RightTriangle(DifferentFigure.RIGHTTRIANGLE.name(),
                        colorSupplier.getRandomColor(), firstline, secondline);
                figure.drow();
                return figure.getArea();
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(DifferentFigure.ISOSCELESTRAPEZOID.name(),
                        colorSupplier.getRandomColor(), firstline, secondline, thirdline);
                figure.drow();
                return figure.getArea();
            default:
                supplierFigure.getRandomFigura();
        }
        return 0.0;
    }

    @Override
    public void drow() {
        getArea();
    }

    public double getFirstline() {
        return firstline;
    }

    public void setFirstline(double firstline) {
        this.firstline = firstline;
    }

    public double getSecondline() {
        return secondline;
    }

    public void setSecondline(double secondline) {
        this.secondline = secondline;
    }

    public double getThirdline() {
        return thirdline;
    }

    public void setThirdline(double thirdline) {
        this.thirdline = thirdline;
    }

    public FigureSupplier getSupplierFigure() {
        return supplierFigure;
    }

    public void setSupplierFigure(FigureSupplier supplierFigure) {
        this.supplierFigure = supplierFigure;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
}
