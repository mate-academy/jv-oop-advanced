package core.basesyntax;

public class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public double getArea() {
        return 0;
    }

    public void draw() {
        System.out.println("Figure: units, area: " +
                " sq. units, side: " + " units, color: ");
    }
}
