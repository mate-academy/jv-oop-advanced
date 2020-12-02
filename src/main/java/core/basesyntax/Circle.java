package core.basesyntax;

public class Circle extends Figures {

    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setArea() {
        super.setArea(Math.PI * radius * radius);
    }

    public void printInfo() {
        System.out.println("Shape: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}
