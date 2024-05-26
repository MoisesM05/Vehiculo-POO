public class Auto extends VehiculoPasajeros{

    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    //Sobrescribir por 3er vez el metodo mostrarInfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: "+tipoCombustible);
    }


    @Override
    public void mantenimiento(){
        super.mantenimiento();
    }


    //Metodo costo de mantenimiento
    public int CostoMantenimiento(int CostoKm, int KmRecorridos){
        int CostoTotal = 0;

        CostoTotal = CostoKm*KmRecorridos;
        System.out.println("El costo del mantenimiento es: "+CostoTotal);

        return CostoTotal;
    }
}
