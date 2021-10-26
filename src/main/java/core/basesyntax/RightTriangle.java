package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double height;
    private String name = "Right Triangle";

    public RightTriangle(String color, double firstLeg, double height) {
        super(color);
        this.height = height;
        this.firstLeg = firstLeg;
    }

    @Override
   public double getArea() {
        return firstLeg * height / 2;
    }

    @Override
    public void draw() {
        String triangleidInfo = "Figure: "
                + name
                + ", area: "
                + getArea()
                + " sq.units, first leg: "
                + firstLeg
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
        System.out.println(triangleidInfo);
    }
}
