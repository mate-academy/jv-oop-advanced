package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Behaviour randomFigure = FigureSupplier.getFigureProperty();
        randomFigure.draw();
    }
}

