package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;

import java.util.Random;

public class SupplierFigure {
    public static final String NAME = "CIRCLE";
    public static final String COLOR = "WHITE";
    public static final double RADIUS = 10;

    public SupplierFigure() {

    }

    public static DifferentFigure getRandomFigura() {
        int index = new Random().nextInt(DifferentFigure.values().length);
        return DifferentFigure.values()[index];
    }

    public Figure getDefaultFigure() {
        System.out.println("Figure= " + NAME + ", Color= "
                + COLOR + ", radius= " + RADIUS);
        return new Circle(NAME, COLOR, RADIUS);
    }

}