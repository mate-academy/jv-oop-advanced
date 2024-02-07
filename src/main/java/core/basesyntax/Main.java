package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrayLimit = 6;
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < arrayLimit; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    Figure randomFigure = new FigureSupplier().getRandomFigure();
                    randomFigure.drawFigure(randomFigure);
                    break;
                case 3:
                case 4:
                case 5:
                default:
                    defaultFigure.drawFigure(defaultFigure);
                    break;
            }
        }
    }
}
