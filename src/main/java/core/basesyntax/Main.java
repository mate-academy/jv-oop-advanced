package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        System.out.println("Default figure: " + defaultFigure);
        System.out.println("Area: " + defaultFigure.getArea());

        for (int i = 0; i < 5; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            System.out.println("Random figure: " + randomFigure);
            System.out.println("Area: " + randomFigure.getArea());
        }
    }
}
