import core.basesyntax.Figure;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_NUMBER = 5;
    public static final int RANDOM_NUMBER = 30;

    public Figure getFigure() {
        int numberOfFigures = new Random().nextInt(FIGURES_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        switch (numberOfFigures) {
            case 1:
                return new Circle(random.nextInt(FIGURES_NUMBER),
                        colorSupplier.getColour());
            case 2:
                return new Square(random.nextInt(RANDOM_NUMBER),
                        colorSupplier.getColour());
            case 3:
                return new Rectangle(random.nextInt(RANDOM_NUMBER),
                        random.nextInt(FIGURES_NUMBER),
                        colorSupplier.getColour());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER), colorSupplier.getColour());
            default:
                return new RightTriangle(random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER), colorSupplier.getColour());

        }
    }
}

