package core.basesyntax;

class Main {
    public static void main(String[] args) {

        Figure[] equal = getFig();
        for (Figure fig : equal) {
            fig.draw();
        }
    }

    public static Figure[] getFig() {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] types = new Figure[6];
        for (int i = 0; i < 6; i++) {
            types[i] = figureSupplier.getRandomFigure();
        }

        return types;
    }

}
