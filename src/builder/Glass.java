package builder;
import java.util.*;
public class Glass {
	String name;
	List<String> materials;
	public void addMaterials(List<String> materials) {
		this.materials = materials;
	}

	void prepare() {
		System.out.println("\nPrepare " + name);
		System.out.println("Using materials to create glass");
		for ( String material : materials ) {
			System.out.println("   " + material );
		}
	}
	void melting() {
		System.out.println("Melt the raw materials at 1500 degrees celcius");
	}
	void tinFloatBath() {
		System.out.println("At this phase the glass is highly viscous flows over shallow pool of molten tin");
	}
	void annealing() {
		System.out.println("Pass the glass through heat treatment to avoid cracking");
	}

	void qualityInspection() {
		System.out.println("Scanners examine the hardened ribbon of glass to identify imperfection");
	}
	void cutting() {
		System.out.println("Trim of the edges of glass using diamond wheels");
	}
	void coating() {
		System.out.println("Coating applied to glass to improve thermal and solar performance");
	}
	void dispatch() {
		System.out.println("Once finished the glass is packed ready for dispatch\n");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----\n");
		for(String material : materials) {
			display.append(material + "\n");
		}
		return display.toString();
	}

}
