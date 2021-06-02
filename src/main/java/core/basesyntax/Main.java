package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

import java.util.Random;


/**
 * Feel free to remove this class and create your own.
 */
public class Main extends FigureSupplier {
    public static void main(String[] args) {

      //Figure figure = getRandomFigure();

      Figure circle = new Circle("RED",2).draw();

      Figure[] figures = new Figure[new Random().ints(2, 21).findFirst().getAsInt()];
      for (int i = 0; i < figures.length; i++) {
          figures[i] = getRandomFigure();
      }



    }
}
