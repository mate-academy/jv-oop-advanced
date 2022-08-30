package core.basesyntax.figureAll;

import core.basesyntax.colorSupplier.ColorSupplier;
import core.basesyntax.FigureOptions;
import core.basesyntax.figureSupplier.DifferentFigure;
import core.basesyntax.figureSupplier.SupplierFigure;

import java.util.Random;

public class RandomFigure  implements FigureOptions {

    private double a;
    private double b;
    private double c;

    FigureOptions figureOptions;


    public RandomFigure(){}

    @Override
    public double areaFigura() {
        a = new Random().nextInt(50);
        b = new Random().nextInt(50);
        c = new Random().nextInt(50);

        switch (SupplierFigure.getRandomFigura()) {
            case CIRCLE:
               figureOptions = new Circle(DifferentFigure.CIRCLE.name(),ColorSupplier.getRandomColor(), a);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case SQUARE:
                figureOptions = new Square(DifferentFigure.SQUARE.name(), ColorSupplier.getRandomColor(), a);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case RECTANGLE:
               figureOptions = new Rectangle(DifferentFigure.RECTANGLE.name(),ColorSupplier.getRandomColor(), a, b);
               figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case RIGHTTRIANGLE:
                figureOptions = new RightTriangle(DifferentFigure.RIGHTTRIANGLE.name(), ColorSupplier.getRandomColor(), a, b);
                figureOptions.infoFigure();
                return figureOptions.areaFigura();
            case ISOSCELESTRAPEZOID:
               figureOptions = new IsoscelesTrapezoid(DifferentFigure.ISOSCELESTRAPEZOID.name(), ColorSupplier.getRandomColor(), a, b, c);
               figureOptions.infoFigure();
                return figureOptions.areaFigura();
        }
        return 0.0;
    }

    @Override
    public void infoFigure() {
      areaFigura();
    }

}
