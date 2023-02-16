public class Principal {
    public static void main(String[] args) {
        Camioneta camioneta = new Camioneta("Ford", 2022, 1500);
        Moto moto = new Moto("Honda", 2021, 250);

        camioneta.transportarCarga();
        camioneta.getMarca();
        moto.acelerar();
        moto.getCilindrada();
    }
}