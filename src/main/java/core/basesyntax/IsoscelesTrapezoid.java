package core.basesyntax;
public class IsoscelesTrapezoid extends Figure {
  private double firstBase;
  private double secondBase;
  private double height;
  public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
    super(color);
    this.firstBase = firstBase;
    this.secondBase = secondBase;
    this.height = height;
  }
  public double getFirstBase() {
    return firstBase;
  }
  public void setFirstBase(double firstBase) {
    this.firstBase = firstBase;
  }
  public double getSecondBase() {
    return secondBase;
  }
  public void setSecondBase(double secondBase) {
    this.secondBase = secondBase;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("Figure: isosceles trapezoid, area: " + getArea()
        + " sq. units, first base: " + getFirstBase()
        + " units, second base: " + getSecondBase() + " units, height: " + getHeight()
        + " units, color: " + getColor().name().toLowerCase());
  }

  @Override
  public double getArea() {
    return 0.5 * (getFirstBase() + getSecondBase()) * getHeight();
  }
}
