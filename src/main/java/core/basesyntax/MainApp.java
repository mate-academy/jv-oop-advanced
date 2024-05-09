package core.basesyntax;

import core.basesyntax.color.ColorSuplier;

public class MainApp {
    public static void main(String[] args) {
        ColorSuplier colorSuplier = new ColorSuplier();
        System.out.println(colorSuplier.getRandomColor());
    }
}
