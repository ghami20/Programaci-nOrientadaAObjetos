import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Persona catalina = new Persona("Catalina");
		Persona julieta = new Persona("Julieta");
		
		
		Iphone iphone = new Iphone("2023",catalina,"17.0");
		Motorola motoU9 = new Motorola("2023",julieta,"7.9");
		
		if (iphone.HacerLlamada(17, motoU9)) {
			JOptionPane.showMessageDialog(null, "El moto le resta" + motoU9.getBateria());
			JOptionPane.showMessageDialog(null, "El iphone le resta" + iphone.getBateria());

		} else {
			JOptionPane.showMessageDialog(null, "No se realizo la llamada");
		}
		
	}

}
