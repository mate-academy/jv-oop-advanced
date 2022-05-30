package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        String[] randomFigures = new String[supplier.getRandomFigure()];
        for (int i = 0; i < randomFigures.length; i++) {
            String showFigure = supplier.getFigures()[i];
            System.out.println(showFigure);
        }
    }
}
