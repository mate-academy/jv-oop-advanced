package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double area;

    Rectangle(Color color) {
        super(color);
    }

    Rectangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.setName(FigureName.RECTANGLE);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = calculateArea();
    }

    @Override
    public void draw() {
        String text = "Figure: " + getName() + ", area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor();
        System.out.println(text);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }
}
