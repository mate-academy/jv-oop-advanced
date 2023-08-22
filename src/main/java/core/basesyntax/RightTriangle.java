package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(Color color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    public RightTriangle(String color, double side, double height) {
        super(color);
        //setColor1(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, " + "area: " + getArea()
                + " sq.units, " + "firstLeg: " + side
                + " units, " + "height: " + height + " units, " + "color: " + getColor());
    }

    @Override
    public void draw2() {
        System.out.println("Figure: rightTriangle, " + "area: " + getArea()
                + " sq.units, " + "firstLeg: " + side
                + " units, " + "height: " + height + " units, " + "color: " + getColor1());
    }

    @Override
    public double getArea() {
        return (side + height) / 2;
    }
}
