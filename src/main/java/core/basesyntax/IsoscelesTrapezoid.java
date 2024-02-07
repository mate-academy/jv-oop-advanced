package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double middleline;

    public IsoscelesTrapezoid(String color, double height, double middleline) {
        super(color);
        this.height = height;
        this.middleline = middleline;
    }

    @Override
    public double calculateArea() {
        return height * middleline;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, "
                + "area: "
                + calculateArea()
                + " sq.units, height: "
                + height
                + " units, middleline: "
                + middleline
                + " units, color: " + getColor());
    }

}

