package core.basesyntax;

import core.basesyntax.Suppliers.AreaSupplier;

public class Figure {
    private String figureName;
    private String figureColor;
    private double figureArea;

    public String getFigureName() {
        return figureName;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public double getFigureArea() {
        return figureArea;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    public void setArea(double figureArea) {
        this.figureArea = figureArea;
    }

    public String figureInfo() {
        StringBuilder builder = new StringBuilder();
        if (figureName.equals("RIGHT_TRIANGLE")) {
            double legA = new AreaSupplier().getRandomValue();
            double legB = new AreaSupplier().getRandomValue();
            builder.append("Figure: ")
                    .append(figureName)
                    .append(", ")
                    .append("Color: ")
                    .append(figureColor);
            return builder.toString();
        } else if (figureName.equals("RECTANGLE")) {
            double width = new AreaSupplier().getRandomValue();
            double length = new AreaSupplier().getRandomValue();
            builder.append("Figure: ")
                    .append(figureName)
                    .append(", ")
                    .append("Color: ")
                    .append(figureColor);
            return builder.toString();
        } else if (figureName.equals("ISOSCELES_TRAPEZOID")) {
            double baseA = new AreaSupplier().getRandomValue();
            double baseB = new AreaSupplier().getRandomValue();
            double height = new AreaSupplier().getRandomValue();
            builder.append("Figure: ")
                    .append(figureName)
                    .append(", ")
                    .append("Color: ")
                    .append(figureColor);
            return builder.toString();
        } else {
            builder.append("Figure: ")
                    .append(figureName)
                    .append(", ")
                    .append("Color: ")
                    .append(figureColor)
                    .append(", ")
                    .append("Area: ")
                    .append(figureArea);
            return builder.toString();
        }
    }
}
