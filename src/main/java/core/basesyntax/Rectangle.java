package core.basesyntax;
public class Rectangle extends Figure {
  private double firstSide;
  private double secondSide;
  public Rectangle(Color color, double firstSide, double secondSide) {
    super(color);
    this.firstSide = firstSide;
    this.secondSide = secondSide;
  }
  public double getFirstSide() {
    return firstSide;
  }
  public double getSecondSide() {
    return secondSide;
  }
  public void setFirstSide(double firstSide) {
    this.firstSide = firstSide;
  }
  public void setSecondSide(double secondSide) {
    this.secondSide = secondSide;
  }

  @Override
  public void draw() {
    System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, first side: "
        + getFirstSide() + " units, second side: " + getSecondSide() + " units, color: "
        + getColor().name().toLowerCase());
  }

  @Override
  public double getArea() {
    return getFirstSide() * getSecondSide();
  }
}
