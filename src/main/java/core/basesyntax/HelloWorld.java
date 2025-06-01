package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {

        Figure[] listOfArray = new Figure[6];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < listOfArray.length; i++) {
            if (i < listOfArray.length / 2) {
                listOfArray[i] = figure.getRandomFigure();
            } else {
                listOfArray[i] = figure.getDefaultFigure();
            }
        }

        for (int i = 0; i < listOfArray.length; i++) {
            listOfArray[i].draw();
        }
    }

}
