package core.basesyntax;

public class Square extends Figures {

    private int side;
    private double diagonal;

    public void setParameters(int side) {
        this.side = side;
        diagonal = Math.sqrt(2) * side;
    }

    public void setArea() {
        super.setArea(side * side);
    }

    public void printInfo() {
        System.out.println("Shape: square, area: " + getArea() + " sq. units, diagonal: "
                + diagonal + " units, color: " + getColor());
    }
}
