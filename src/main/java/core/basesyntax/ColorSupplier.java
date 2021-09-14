package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        String[] stringsColor = new String[10];
        stringsColor[0] = "white";
        stringsColor[1] = "black";
        stringsColor[2] = "green";
        stringsColor[3] = "yellow";
        stringsColor[4] = "blue";
        stringsColor[5] = "red";
        stringsColor[6] = "brown";
        stringsColor[7] = "gray";
        stringsColor[8] = "purple";
        stringsColor[9] = "violet";
        int colorNumber = (int) (Math.random() * 10);
        return stringsColor[colorNumber];
    }
}
