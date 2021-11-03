package Clases;

public class SmartDevice {

    // 1. Atributos
    protected String fabricante;
    protected String modelo;
    protected String tipoPantalla;
    protected double peso;
    protected double grosor;
    protected String os;

    // 2. Constructores
    // Constructor vacío:
    public SmartDevice(){
    }

    public SmartDevice(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public SmartDevice(String fabricante, String modelo, String tipoPantalla, double peso, double grosor, String os) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipoPantalla = tipoPantalla;
        this.peso = peso;
        this.grosor = grosor;
        this.os = os;
    }

    // 3. Métodos
}
