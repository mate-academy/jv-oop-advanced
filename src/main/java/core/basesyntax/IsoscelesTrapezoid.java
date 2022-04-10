package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureBehaviour {
    double side1;
    double side2;
    double height;

    public String getColor() {
        return super.getColor();
    }

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
                + this.side1
                + " units, side_2: "
                + this.side2
                + " units, height: "
                + this.height
                + " units, color: "
                + this.color
                + "\n");
    }

    @Override
    public IsoscelesTrapezoid setRandomParameters() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.side1 = Main.random.nextInt(MAX_PARAMETER_LENGTH);
        isoscelesTrapezoid.side2 = Main.random.nextInt(MAX_PARAMETER_LENGTH);
        isoscelesTrapezoid.height = Main.random.nextInt(MAX_PARAMETER_LENGTH);
        return isoscelesTrapezoid;
    }
}
