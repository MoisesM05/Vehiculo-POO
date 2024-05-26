public class VehiculoCarga extends Vehiculo{

    private int capacidadCarga;
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //Getter y Setter capacidad de carga
    public int getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    //Sobreescribimos otra ves el metodo mostrarInfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de carga: "+capacidadCarga+" kg");
    }
}
