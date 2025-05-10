package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int randomNum = min + (int)(Math.random() * max);
        Figure[] list = new Figure[randomNum];

        for (int i = 0; i < randomNum; i++) {
            FigureSupplier newFigure = new FigureSupplier();
            list[i] = newFigure.getRandomFigure();
        }
        for (Figure item: list) {
            item.draw();
        }
    }
}

