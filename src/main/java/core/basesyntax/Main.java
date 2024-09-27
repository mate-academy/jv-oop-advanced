package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier fp = new FigureSupplier();
        for (int i = 0; i < 5; i++) {
            fp.getRandomFigure().draw();
        }
    }
}

