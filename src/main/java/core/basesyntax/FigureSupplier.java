package core.basesyntax;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getDefaultFigure(){
        return new Circle(10, Colors.white);
    }

    public Figure getRandomFigure() {
        switch (RANDOM.nextInt(4)) {
            case 0 -> {
                return new Square(RANDOM.nextInt(6), COLOR_SUPPLIER.getRandomColor());
            }
            case 1 -> {
                return new Rectangle(RANDOM.nextInt(6),RANDOM.nextInt(6),COLOR_SUPPLIER.getRandomColor());
            }
            case 2 -> {
                return new Circle(RANDOM.nextInt(6), COLOR_SUPPLIER.getRandomColor());
            }
            case 3 -> {

                return new IsoscelesTrapezoid(RANDOM.nextInt(6), RANDOM.nextInt(6),RANDOM.nextInt(6), COLOR_SUPPLIER.getRandomColor() );
            }
            default -> {
                return getDefaultFigure();
            }
        }
    }
}
