package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int quantityFiguresToCreate = 6;
        int randomFigureLimit = 3;
        Figure[] figures = new Figure[quantityFiguresToCreate];
        FigureSupplier figureSupplier = new FigureSupplier();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < figures.length; i++) {
            if (randomFigureLimit > 0) {
                figures[i] = figureSupplier.getRandomFigure();
                stringBuilder.append("Figure: ").append(figures[i].draw()).append('\n');
                randomFigureLimit--;
                continue;
            }
            figures[i] = figureSupplier.getDefaultFigure();
            stringBuilder.append("Figure: ").append(figures[i].draw()).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
