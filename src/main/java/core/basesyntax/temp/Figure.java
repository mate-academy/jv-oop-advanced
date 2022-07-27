package core.basesyntax.temp;

public abstract class Figure implements Behavior {
    private String color;
    private double figureArea;
    private double [] fields = new double[9];
    //RightTriangle
    private double firstLeg;
    private double secondLeg;
    //IsoscelesTrapezoid
    private double basisA;
    private double basisB;
    private double height;
    //Square
    private double side;
    //Circle
    private double radius;
    //Rectangle
    private double firstSide;
    private double secondSide;

    /*       //RightTriangle
           double firstLeg = fields[0];
           double secondLeg = fields[1];
           //IsoscelesTrapezoid
           double basisA = fields[2];
           double basisB = fields[3];
           double height = fields[4];
           //Square
           double side = fields[5];
           //Circle
           double radius = fields[6];
           //Rectangle
           double firstSide = fields[7];
           double secondSide = fields[8];
*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getBasisA() {
        return basisA;
    }

    public void setBasisA(double basisA) {
        this.basisA = basisA;
    }

    public double getBasisB() {
        return basisB;
    }

    public void setBasisB(double basisB) {
        this.basisB = basisB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getFigureArea() {
        return figureArea;
    }

    public void setFigureArea(double figureArea) {
        this.figureArea = figureArea;
    }

    public double[] getFields() {
        return fields;
    }

    public void setFields() {
        this.fields = fields;
    }

    public void setDefaultRadius(double radius) {
        fields[6] = radius;
    }

    public abstract void calculatingSquare();

    @Override
    public String toString() {
        return "Figure: toString method";
    }
}
