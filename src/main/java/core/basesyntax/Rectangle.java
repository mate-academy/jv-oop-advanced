package core.basesyntax;

public class Rectangle extends Figure implements FigureBehaviour {
    private double side1;
    private double side2;

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

    @Override
    public double calculateArea() {
        return (this.side1 * this.side2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + " sq.units, side_1: "
                + this.getSide1()
                + " units, side_2: "
                + this.getSide2()
                + " units, color: "
                + this.getColor()
                + "\n");
    }

    @Override
    public Rectangle setRandomParameters() {
        Rectangle rectangle = new Rectangle();
        rectangle.side1 = Main.getRandom().nextInt(maxParameterLength);
        rectangle.side2 = Main.getRandom().nextInt(maxParameterLength);
        return rectangle;
    }
}
