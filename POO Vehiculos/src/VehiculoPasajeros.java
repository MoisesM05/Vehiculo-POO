public class VehiculoPasajeros extends Vehiculo{
    private int numPasajeros;

    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    //Getter y Setter de numPasajeros
    public int getNumPasajeros(){
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }

    //Sobrescribir el metodo mostrarInfo de la clase Vehiculo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: "+numPasajeros);
    }

    @Override
    public void mantenimiento(){
        super.mantenimiento();
        System.out.println("Inspeccion de los "+numPasajeros+" cinturones de seguridad de los acientos");
    }

}
