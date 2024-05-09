
public class Iphone extends Celular{
	private String VersionIos;

	public Iphone(String modelo, Persona persona,String versionIos) {
		super("Iphone", modelo, persona, 5,0.1);
		VersionIos = versionIos;
	}

	public String getVersionIos() {
		return VersionIos;
	}

	public void setVersionIos(String versionIos) {
		VersionIos = versionIos;
	}

	@Override
	public String toString() {
		return "Iphone [VersionIos=" + VersionIos + "]";
	}
	
	
	

}
