public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    //Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    //Getter y Setter
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){

        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.marca = marca;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    //Metodo para mostrar informacion del vehiculo
    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
        System.out.println("Kilometraje: "+kilometraje);
    }

    //Metodo mentenimiento
    public void mantenimiento(){
        System.out.println("\nMantenimiento para el vehiculo "+marca+" modelo "+modelo);
        System.out.println("Revisión de la caja de cambios para el "+marca);
        System.out.println("Cambio de algunas piezas para el modelo: "+modelo);
        System.out.println("Cambio de aceite del "+marca);
    }
}
