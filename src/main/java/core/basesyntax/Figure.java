package core.basesyntax;

public abstract class Figure {
    private String color;
    double square;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public abstract double getSquare();
    public void printSquareInfo() {
     System.out.println("Figure: " + this.getClass());
    }

}
