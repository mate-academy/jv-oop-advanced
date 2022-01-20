package core.basesyntax;

public class Trapezoid extends Figure implements Properties {
    private String name = "Isosceles Trapezoid";
    private String color;
    private double baseA;
    private double baseB;
    private double height;

    Trapezoid() {
    }

    Trapezoid(double baseA, double baseB, double height, String color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.color = color;
    }

    public double countArea() {
        return (baseA + baseB) * height / 2;
    }

    public void getInfo() {
        System.out.println("Figure: " + this.name + ", area: " + this.countArea()
                + " sq.un., baseA: " + this.baseA + " units, baseB: " + this.baseB
                + " units, height: " + this.height + " units, color: " + this.color + ".");
    }

}
