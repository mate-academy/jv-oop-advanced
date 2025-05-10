package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;
    private double area;

    RightTriangle(Color color) {
        super(color);
    }

    RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.setName(FigureName.RIGHTTRIANGLE);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = Math.sqrt(Math.pow(firstLeg,2) + Math.pow(secondLeg, 2));
        this.area = calculateArea();
    }

    @Override
    public void draw() {
        String text = "Figure: " + getName() + ", area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, hypotenuse: " + getHypotenuse()
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

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
