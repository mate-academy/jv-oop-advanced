package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figuresupplier.DifferentFigure;
import core.basesyntax.figuresupplier.SupplierFigure;
import java.util.Random;

public class RandomFigure extends Figure {

    private AreaCalculator figureOptions;
    private double firstline;
    private double secondline;
    private double thirdline;

    public RandomFigure() {
    }

    public AreaCalculator getFigureOptions() {
        return figureOptions;
    }

    public void setFigureOptions(AreaCalculator figureOptions) {
        this.figureOptions = figureOptions;
    }

    @Override
    public double areaFigura() {
        firstline = new Random().nextInt(50);
        secondline = new Random().nextInt(50);
        thirdline = new Random().nextInt(50);

        switch (SupplierFigure.getRandomFigura()) {
            case CIRCLE:
                figureOptions = new Circle(DifferentFigure.CIRCLE.name(),
                        ColorSupplier.getRandomColor(), firstline);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case SQUARE:
                figureOptions = new Square(DifferentFigure.SQUARE.name(),
                        ColorSupplier.getRandomColor(), firstline);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case RECTANGLE:
                figureOptions = new Rectangle(DifferentFigure.RECTANGLE.name(),
                        ColorSupplier.getRandomColor(), firstline, secondline);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case RIGHTTRIANGLE:
                figureOptions = new RightTriangle(DifferentFigure.RIGHTTRIANGLE.name(),
                        ColorSupplier.getRandomColor(), firstline, secondline);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case ISOSCELESTRAPEZOID:
                figureOptions = new IsoscelesTrapezoid(DifferentFigure.ISOSCELESTRAPEZOID.name(),
                        ColorSupplier.getRandomColor(), firstline, secondline, thirdline);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
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
