public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalle() {
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }

}
