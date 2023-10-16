package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        figures[0] = figureSupplier.getDefaultFigure();
        figures[1] = new Square(Colors.BLUE.name(), 10);
        figures[2] = new IsoscelesTrapezoid(Colors.GREEN.name(), 25, 20, 10);
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drow();
            } else {
                figures[i].drow();
            }
        }
    }
}
