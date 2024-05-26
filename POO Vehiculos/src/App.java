public class App {
    public static void main(String[] args) throws Exception {
       
        //Auto
        Auto auto = new Auto("Ferrari", "250 GT Berlinetta", 2024, 1050, 4, "Daynamax Plus");

        //Camion
        Camion camion = new Camion("KIA MOTORS", "K3000", 2019, 900, 990000, 2);
       
        //Mostrar informacion del auto
        System.out.println("La información del auto es: ");
        auto.mostrarInfo();
        auto.mantenimiento();
        auto.CostoMantenimiento(20, 175);

        System.out.println("\nLa informacion del camion es: ");
        camion.mostrarInfo();
        camion.mantenimiento();
    }


}
