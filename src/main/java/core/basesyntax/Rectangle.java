package core.basesyntax;

public class Rectangle extends Figures {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return secondLeg * firstLeg;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "rectangle "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + firstLeg + ",secondLeg: "
                + secondLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
