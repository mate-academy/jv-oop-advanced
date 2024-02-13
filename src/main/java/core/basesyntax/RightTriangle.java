package core.basesyntax;

public class RightTriangle extends Figure {
    int firstLeg;
    int secondLeg;
    @Override
    public Double area() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void info() {
        System.out.println("Figure: right triangle, area: " + area() + " sq. units, first leg: "
                + firstLeg + ", second leg: " + secondLeg
                +  " units, color: " + color);
    }
}
