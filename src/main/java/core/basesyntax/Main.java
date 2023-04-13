package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int random = 0; random < 3; random++) {
            figures[random] = figureSupplier.getRandomFigure();
        }
        for (int def = 3; def < 6; def++) {
            figures[def] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            if (figure != null) {
                figure.draw();
            } else {
                System.out.println("EMPTY .-.");
            }
        }
    }
}
