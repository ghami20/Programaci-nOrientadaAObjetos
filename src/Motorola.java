
public class Motorola extends Celular{

	private String VersionAndroid;

	public Motorola( String modelo,Persona persona,String versionAndroid) {
		super("Motorola", modelo, persona, 5, 0.25);
		VersionAndroid = versionAndroid;
	}

	public String getVersionAndroid() {
		return VersionAndroid;
	}

	public void setVersionAndroid(String versionAndroid) {
		VersionAndroid = versionAndroid;
	}

	@Override
	public String toString() {
		return "Motorola [VersionAndroid=" + VersionAndroid + "]";
	}
	
	
	
}
