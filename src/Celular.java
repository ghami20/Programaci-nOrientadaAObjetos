
public abstract class Celular {
	private String marca;
	private String modelo;
	private Persona persona;
	private double bateria;
	private double perdidaBateria;
	public Celular(String marca, String modelo, Persona persona, double bateria, double perdidaBateria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
		this.bateria = bateria;
		this.perdidaBateria = perdidaBateria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public double getBateria() {
		return bateria;
	}
	public void setBateria(double bateria) {
		this.bateria = bateria;
	}
	public double getPerdidaBateria() {
		return perdidaBateria;
	}
	public void setPerdidaBateria(double perdidaBateria) {
		this.perdidaBateria = perdidaBateria;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", persona=" + persona + ", bateria=" + bateria
				+ ", perdidaBateria=" + perdidaBateria + "]";
	}
	public boolean HacerLlamada(int duracion,Celular celular) {
		return true;
	}
	public boolean VerEstado() {
		return true;

	}
	public void RecargarCelular() {
		
	}
	
	
}
