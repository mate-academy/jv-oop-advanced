package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator{
  String color;

  abstract String printFigureType();
}
