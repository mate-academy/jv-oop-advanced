package figure;

import java.util.Random;

public class FigureMain extends FigureSupplier {

    public static void main(String[] args) {
        Figure[] figures = createRandomArrayOfFigures(new Random().nextInt(RANDOM_UNIT) + 1);
        for (Figure element : figures) {
            element.draw();
        }
    }
}
