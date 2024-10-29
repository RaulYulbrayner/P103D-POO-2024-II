package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678", "juan@mail.com", "Calle Falsa 123");

        // Crear vehículos
        Camion camion = new Camion("ABC123", "Volvo", "2020", 15000);
        Furgoneta furgoneta = new Furgoneta("DEF456", "Ford", "2019", "manual");
        Motocicleta moto = new Motocicleta("GHI789", "Yamaha", "2021", 250);

        // Crear envíos
        Envio envio1 = new Envio("E001", ZonaEntrega.RURAL, "10/10/2024", cliente1, camion, 3, 100);
        Envio envio2 = new Envio("E002", ZonaEntrega.URBANA, "12/10/2024", cliente1, furgoneta, 0, 50);
        Envio envio3 = new Envio("E003", ZonaEntrega.URBANA, "15/10/2024", cliente1, moto, 0, 10);

        // Crear paquetes y agregarlos a los envíos
        Paquete paquete1 = new Paquete("P001", 20);
        Paquete paquete2 = new Paquete("P002", 10);
        Paquete paquete3 = new Paquete("P003", 5);

        envio1.agregarPaquete(paquete1);
        envio1.agregarPaquete(paquete2);
        envio2.agregarPaquete(paquete3); // Paquete solo en envío de furgoneta
        envio3.agregarPaquete(paquete3); // Paquete agregado también al envío de motocicleta

        // Agregar envíos al cliente
        cliente1.agregarEnvio(envio1);
        cliente1.agregarEnvio(envio2);
        cliente1.agregarEnvio(envio3);

        // Calcular los costos individuales
        double costoCamion = envio1.calcularCosto();
        double costoFurgoneta = envio2.calcularCosto();
        double costoMoto = envio3.calcularCosto();

        // Mostrar costos separados
        System.out.println("Costo del envío en Camión: $" + costoCamion);
        System.out.println("Costo del envío en Furgoneta: $" + costoFurgoneta);
        System.out.println("Costo del envío en Motocicleta: $" + costoMoto);

        // Calcular el costo total de todos los envíos
        double costoTotal = cliente1.calcularCostoTotalEnvios();
        System.out.println("El costo total de todos los envíos es: $" + costoTotal);

    }
}
