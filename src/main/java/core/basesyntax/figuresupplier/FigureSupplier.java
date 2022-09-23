package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;

import java.util.Random;

public class FigureSupplier {
    public static final String NAME = "CIRCLE";
    public static final String COLOR = "WHITE";
    public static final double RADIUS = 10;
    private static Random random = new Random();

    public FigureSupplier() {

    }

    public Figure getDefaultFigure() {
        System.out.println("Figure= " + NAME + ", Color= "
                + COLOR + ", radius= " + RADIUS);
        return new Circle(NAME, COLOR, RADIUS);
    }

    public int getRandomFigure() {
        return random.nextInt(5);
    }
}
