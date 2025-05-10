package core.basesyntax;

public abstract class Figure implements FigureMath, FigureDrawer {
    private String name;
    private String symbol;
    private String color;
    private double area;
    private double borderLength;

    void setName(String name) {
        this.name = name;
    }

    void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    void setColor(String color) {
        if (color.length() != 6) {
            this.color = "#" + ColorSupplier.getRandomColor();
            System.out.println("Your color is wrong and changed to new!\n"
                            + "Color: #" + color + " => " + this.color);
        } else {
            this.color = "#" + color;
        }
    }

    void setArea(double area) {
        this.area = area;
    }

    void setBorderLength(double borderLength) {
        this.borderLength = borderLength;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getArea() {
        return area;
    }

    public double getBorderLength() {
        return borderLength;
    }

    public String getColor() {
        return color;
    }
}
