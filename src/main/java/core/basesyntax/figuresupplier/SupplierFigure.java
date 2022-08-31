package core.basesyntax.figuresupplier;
import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import java.util.Random;

public class SupplierFigure {
    public static final String NAME = "CIRCLE";
    public static final String COLOR = "WHITE";
    public static final double RADIUS = 10;
    private static Random random = new Random();

    public SupplierFigure() {

    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        SupplierFigure.random = random;
    }

    public DifferentFigure getRandomFigura() {
        int index = random.nextInt(DifferentFigure.values().length);
        return DifferentFigure.values()[index];
    }

    public Figure getDefaultFigure() {
        System.out.println("Figure= " + NAME + ", Color= "
                + COLOR + ", radius= " + RADIUS);
        return new Circle(NAME, COLOR, RADIUS);
    }
}
