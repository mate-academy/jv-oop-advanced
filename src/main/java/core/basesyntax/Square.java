package core.basesyntax;

public class Square extends Figures {
    private double oneLeg;
    private String color;

    public Square(double oneLeg, String color) {
        this.color = color;
        this.oneLeg = oneLeg;
    }

    @Override
    public double getArea() {
        return oneLeg * oneLeg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "rectangle "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + oneLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
