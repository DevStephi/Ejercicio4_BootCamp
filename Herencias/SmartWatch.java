package Herencias;

import Clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    String color;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, String tipoPantalla, double peso, double grosor, String os, String color) {
        super(fabricante, modelo, tipoPantalla, peso, grosor, os);
        this.color = color;
    }
}
