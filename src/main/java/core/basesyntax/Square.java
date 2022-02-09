package core.basesyntax;

import java.util.Random;

public class Square implements FigureArea, Draw {
    private double area;
    private int side;
    private String color;


    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }



    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getDraw() {
        return "Square, area: " +
                getArea() +
                " sq.units, " +
                "side: " + side +
                " units, " +
                "color: '" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
