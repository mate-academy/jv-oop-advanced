package core.basesyntax;

public class Triangle extends Figure {
    private String name = "Right Triangle";
    private String color;
    private double firstLeg;
    private double secondLeg;

    Triangle() {
    }

    Triangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public double countArea() {
        return firstLeg * secondLeg / 2;
    }

    public void getInfo() {
        System.out.println("Figure: " + this.name + ", area: " + this.countArea()
                + " sq.un., firstLeg: " + this.firstLeg + " units, secondLeg: " + this.secondLeg
                + " units, color: " + this.color + ".");
    }

}
