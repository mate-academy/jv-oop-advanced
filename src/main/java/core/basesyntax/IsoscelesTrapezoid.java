package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureBehaviour {
    private double side1;
    private double side2;
    private double height;

    public void setColor(String color) {
        super.setColor(color);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((this.side1 + this.side2) * height / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + " sq.units, side_1: "
                + this.getSide1()
                + " units, side_2: "
                + this.getSide2()
                + " units, height: "
                + this.getHeight()
                + " units, color: "
                + this.getColor()
                + "\n");
    }

    @Override
    public IsoscelesTrapezoid setRandomParameters() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.side1 = Main.getRandom().nextInt(maxParameterLength);
        isoscelesTrapezoid.side2 = Main.getRandom().nextInt(maxParameterLength);
        isoscelesTrapezoid.height = Main.getRandom().nextInt(maxParameterLength);
        return isoscelesTrapezoid;
    }
}
