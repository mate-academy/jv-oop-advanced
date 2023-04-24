package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements AreaCalculator, Drawable{
private double randomSide;

  Square(String color, double randomSide) {
    this.color = color;
    this.randomSide = randomSide;
  }
  @Override
  String printFigureType() {
    return "Figure: square,";
  }
  @Override
  public double printArea() {
    return randomSide * randomSide;
  }
  @Override
public void draw() {
    System.out.println(printFigureType()
      + " area: "
      + printArea()
      + " sq.units, side: "
      + randomSide
      + " units, color: "
      + color);
  }
}
