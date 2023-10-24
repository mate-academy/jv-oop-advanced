package core.basesyntax;

public class Rectangle extends Figure {
    private double side;
    private double downSide;

    public Rectangle(String color, double side, double downSide) {
        super(color);
        this.side = side;
        this.downSide = downSide;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return side * downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getName()
                + ", area: "
                + getArea()
                + " units, "
                + "down side: "
                + getDownSide()
                + "units, color: "
                + getColor()
        );
    }
}
