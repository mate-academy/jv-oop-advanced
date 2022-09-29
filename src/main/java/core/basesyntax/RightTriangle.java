package core.basesyntax;

public class RightTriangle extends Figure implements FiguresArea, Drawable {
  private int firstLeg;
  private int secondLeg;

  public RightTriangle(int firstLeg, int secondLeg) {
    this.firstLeg = firstLeg;
    this.secondLeg = secondLeg;
  }

  @Override
  public int getArea() {
    return firstLeg * secondLeg / 2;
  }

  @Override
  public void draw() {
    System.out.println("Figure: RightTriangle, area: " + getArea() + " sq.units, first leg: " + firstLeg + " units, second leg: " + secondLeg
            + " units, color: " + getColor());
  }
}
