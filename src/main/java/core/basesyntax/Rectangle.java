package core.basesyntax;

public class Rectangle extends Figure {
    private double longerSide;
    private double shorterSide;

    public Rectangle(double longerSide, double shorterSide, String color) {
        super(color);
        this.longerSide = longerSide;
        this.shorterSide = shorterSide;
    }

    @Override
    public double calculateArea() {
        return longerSide * shorterSide;
    }

    @Override
    public String draw() {
        String baseInfo = super.draw();
        return baseInfo + ", longer side: " + longerSide + " units "
                + ", shorter side: " + shorterSide + " units ";
    }
}
