package figure;

public class FigureMain extends FigureSupplier {
    public static void main(String[] args) {
        Figure[] figures = createRandomArrayOfFigures(5);
        for (Figure element : figures) {
            element.draw();
        }
    }
}
