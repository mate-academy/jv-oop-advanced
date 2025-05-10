package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double height;

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
                + this.getClass().getSimpleName()
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
