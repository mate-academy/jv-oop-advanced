package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    public String getName() {
        return "right triangle";
    }

    public String getInfo() {
        return "first leg: " + firstLeg + " unit, second leg: "
                + secondLeg + " unit, " + "color: " + color;
    }
}

