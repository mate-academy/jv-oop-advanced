package core.basesyntax;

class HelloWorld {
    public static void main(String[] args) {

        Figure[] equal = getFig();
        for (Figure fig : equal) {
            fig.draw();
        }
    }

    public static Figure[] getFig() {
        FigureSupplier figureSupplier = new FigureSupplier(6, 50);
        Figure[] types = new Figure[6];
        for (int i = 0; i < 6; i++) {
            types[i] = figureSupplier.getRandomFigure();
        }
        return types;
    }

}
