package core.basesyntax;

public class Rectangle extends Figures {
    private int side1;
    private int side2;
    private double diagonal;

    public void setParameters(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
        diagonal = Math.sqrt(side1 * side1 + side2 * side2);
    }

    public void setArea() {
        super.setArea(side1 * side2);
    }

    public void printInfo() {
        System.out.println("Shape: rectangle, area: " + getArea() + " sq. units, diagonal: "
                + diagonal + " units, color: " + getColor());
    }
}

