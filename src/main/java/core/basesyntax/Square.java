package core.basesyntax;

public class Square extends Figure implements AreaCalculation{
    private double firstLeg;
    private String color;
    private double area;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area = calculatinonArea();
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculatinonArea() {
        return firstLeg  * firstLeg;
    }

    @Override
    public String toString() {
        return "Square: " +
                "firstLeg = " + firstLeg +
                ", color = " + color +
                ", area = " + area;
    }
}
