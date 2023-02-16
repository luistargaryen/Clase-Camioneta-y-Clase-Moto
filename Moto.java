
// Clase Moto
public class Moto {
    // Atributos
    private String marca;
    private int modelo;
    private int cilindrada;

    // Constructor
    public Moto(String marca, int modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void acelerar() {
        System.out.println("Acelerando la moto " + marca + " " + modelo);
    }
}