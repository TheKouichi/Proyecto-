package herenciaypolimorfismo;

public class Camion extends Vehiculo
{
	//Atributos
	private int limiteCarga;
	
	public Camion(int numRuedas, String combustible, String marca, String color, String motor, int limiteCarga) 
	{
		super(numRuedas, combustible, marca, color, motor);
		this.limiteCarga = limiteCarga;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int getLimiteCarga() {
		return limiteCarga;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String mostrarDatos() {
		return super.mostrarDatos() + limiteCarga;
	}


	

}
