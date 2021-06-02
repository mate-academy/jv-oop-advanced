package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private double verticalLeg;
    private double horizontalLeg;

    public Rectangle(double verticalLeg, double horizontalLeg, String color) {
        this.verticalLeg = verticalLeg;
        this.horizontalLeg = horizontalLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return verticalLeg * horizontalLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                +
                getArea()
                +
                " sq.units, verticalLeg: " + verticalLeg
                +
                " units, horizontalLeg "
                +
                horizontalLeg
                +
                " units, color: "
                +
                getColor());
    }
}
