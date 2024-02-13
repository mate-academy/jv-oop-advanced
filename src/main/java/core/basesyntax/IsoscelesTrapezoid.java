package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int firstBase;
    int secondBase;
    int leg;

    @Override
    public Double area() {
        return (double) leg * leg - (firstBase - secondBase) * (firstBase - secondBase) / 4;
    }

    @Override
    public void info() {
        System.out.println("Figure: isosceles trapezoid, area: " + area() + " sq. units, first base: "
                + firstBase + ", second base: " + secondBase + ", leg: " + leg
                +  " units, color: " + color);
    }
}
