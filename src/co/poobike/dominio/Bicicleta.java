package co.poobike.dominio;

public class Bicicleta {
	public String color;
	public String serial;	
	private double velocidad;	
	private int nroCambio;
	private double cadencia;
	
	public Bicicleta() {
		this("0", "NINGUNO");
	}
	
	public Bicicleta(String serial) {
		this.serial = serial;
	}
	
	public Bicicleta(String serial, String color) {
		this(serial);
		this.color = color;
	}
	
	public void acelerar(double incremento) {
		if(incremento < 1) {
			System.out.println("El incremento no puede ser menor que 1");
		} else {			
			this.velocidad += incremento;
		}
	}

	public void frenar(double decremento) {
		if(decremento > this.velocidad) {
			System.out.println("No puede frenar más de la velocidad a la que va");
		} else {			
			this.velocidad -= decremento;
		}
	}

	public void modificarCambio(int nuevoCambio) {
		this.nroCambio = nuevoCambio;
	}

	public void modificarCadencia(double nuevaCadencia) {
		this.cadencia = nuevaCadencia;
	}
	
	public String verVelocidad() {
		return "La bicicleta va a " + this.velocidad  + " km/h";
	}
	
	public String verCambio() {
		return "La bicicleta va en el cambio #" + this.nroCambio;
	}
	
	public String verCadencia() {
		return "La bicicleta va a " + this.cadencia  + " pedaleadas por minuto";
	}
}