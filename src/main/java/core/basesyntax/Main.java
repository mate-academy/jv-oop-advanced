package core.basesyntax;

public class Main {

    public static final int RANDOM_QUANTITY = 100;

    public static void main(String[] args) {
        int randomQuantity = (int) (Math.random() * RANDOM_QUANTITY);
        FigureSupplier figuresupplier = new FigureSupplier();
        Drawable[] figures = new Drawable[randomQuantity];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figuresupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
