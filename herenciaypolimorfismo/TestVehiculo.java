package herenciaypolimorfismo;

public class TestVehiculo 
{
	public static void main(String[] args)
	{
		Vehiculo vehiculo1 = new Vehiculo(4, "Gasolina", "Nissan", "Blanco", "tdi 1.5");
		System.out.println("Datos del coche: ");
		System.out.println(vehiculo1.mostrarDatos());
		
		
		Camion camion1 = new Camion(10, "Diesel", "Volvo", "Azul", "tdi 5000", 10000);
		System.out.println("Datos del camion: ");
		System.out.println(camion1.mostrarDatos());
		

	}

}
