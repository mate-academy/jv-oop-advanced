package core.basesyntax;

public abstract class Figure implements Draw {
    private final String name;
    private int sideA;
    private int sideB;
    private int side;
    private int height;
    private final String color;

    public Figure(String name, int side, String color) {
        this.name = name;
        this.side = side;
        this.color = color;
    }

    public Figure(String name, int sideA, int sideB, String color) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public Figure(String name, int sideA, int sideB, int height, String color) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    public abstract void getsSquare();

    public String getName() {
        return name;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSide() {
        return side;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getSideA() {
        return sideA;
    }
}

