package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;
import core.basesyntax.InformationFigures;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figuresupplier.DifferentFigure;
import core.basesyntax.figuresupplier.SupplierFigure;
import java.util.Random;

public class RandomFigure extends Figure {

    private double firstline;
    private double secondline;
    private double thirdline;

    public RandomFigure() {
    }

    @Override
    public double areaFigura() {
        Figure figure;
        firstline = new Random().nextInt(50);
        secondline = new Random().nextInt(50);
        thirdline = new Random().nextInt(50);

        switch (SupplierFigure.getRandomFigura()) {
            case CIRCLE:
               figure = new Circle(DifferentFigure.CIRCLE.name(),
                        ColorSupplier.getRandomColor(), firstline);
                figure.infoFigure();
                return figure.areaFigura();
            case SQUARE:
                figure = new Square(DifferentFigure.SQUARE.name(),
                        ColorSupplier.getRandomColor(), firstline);
                figure.infoFigure();
                return figure.areaFigura();
            case RECTANGLE:
                figure = new Rectangle(DifferentFigure.RECTANGLE.name(),
                        ColorSupplier.getRandomColor(), firstline, secondline);
                figure.infoFigure();
                return figure.areaFigura();
            case RIGHTTRIANGLE:
                figure = new RightTriangle(DifferentFigure.RIGHTTRIANGLE.name(),
                        ColorSupplier.getRandomColor(), firstline, secondline);
                figure.infoFigure();
                return figure.areaFigura();
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(DifferentFigure.ISOSCELESTRAPEZOID.name(),
                        ColorSupplier.getRandomColor(), firstline, secondline, thirdline);
                figure.infoFigure();
                return figure.areaFigura();
            default:
                SupplierFigure.getRandomFigura();
        }
        return 0.0;
    }

    @Override
    public void infoFigure() {
        areaFigura();
    }

}
