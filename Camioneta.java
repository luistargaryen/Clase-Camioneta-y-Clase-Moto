
// Clase Camioneta
public class Camioneta {
    // Atributos
    private String marca;
    private int modelo;
    private int capacidadCarga;

    // Constructor
    public Camioneta(String marca, int modelo, int capacidadCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    // Métodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void transportarCarga() {
        System.out.println("Transportando carga en la camioneta " + marca + " " + modelo);
    }
}