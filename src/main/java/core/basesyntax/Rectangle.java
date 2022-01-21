package core.basesyntax;

public class Rectangle extends Figure {
    private String name = "Rectangle";
    private String color;
    private double sideA;
    private double sideB;

    Rectangle() {
    }

    Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public double countArea() {
        return sideA * sideB;
    }

    public void getInfo() {
        System.out.println("Figure: " + this.name + ", area: " + this.countArea()
                + " sq.un., sideA: " + this.sideA + " units, sideB: " + this.sideB
                + " units, color: " + this.color + ".");
    }

}
