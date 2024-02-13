package core.basesyntax;

class Rectangle extends Figure {
    int firstLeg;
    int secondLeg;
    @Override
    public Double area() {
        return (double) firstLeg * secondLeg;
    }

    @Override
    public void info() {
        System.out.println("Figure: rectangle, area: " + area() + " sq. units, first leg: "
                + firstLeg + ", second leg: " + secondLeg
                +  " units, color: " + color);
    }
}
