package core.basesyntax.figures;

public class RightTriangle extends Figure {
    int firstLeg = 10;
    int secondLeg = 20;

    @Override
    public int area() {
        return firstLeg + secondLeg;
    }

    @Override
    public void print() {
        System.out.println("Figure: rightTriangle" + ", area: " + this.area() + " firstLeg: "
                + this.firstLeg + " secondLeg: "
                + this.secondLeg + " units, color: " + this.color);
    }

}
