package core.basesyntax.Model;

public class Square extends Figures {

    private int length;

    public Square(String color, int length) {
        super(color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getMeasure() {
        return length * length;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure Square, measure: " + getMeasure() + ", Color: " + getColor());
    }
}
