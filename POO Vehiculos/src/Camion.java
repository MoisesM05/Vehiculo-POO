public class Camion extends VehiculoCarga{

    private int numEjes;
    public Camion(String marca, String modelo, int año, int kilometraje,int capacidadCarga,int numEjes){

        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;

    }

    //Getter y Setter
    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    //Sobrescribir por 4ta vez el metodo mostrarInfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de ejes: "+numEjes);
    }

    //Método mantenimiento del camion
    @Override
    public void mantenimiento(){
        super.mantenimiento();
        System.out.println("Mantenimiento de las suspenciones del camión");
        System.out.println(".......................................................");
        System.out.println("Se daño una de las suspenciones, ahora cargara menos :)");
        System.out.println("Inspeccion de los "+numEjes+" ejes.");
    }
}
