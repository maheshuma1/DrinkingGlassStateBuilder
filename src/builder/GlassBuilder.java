package builder;
import java.util.*;
public abstract class GlassBuilder {

	String name;
	List<String> materials = new ArrayList<String>();

	public abstract GlassBuilder addAcrylic();
	public abstract GlassBuilder addSilicone();
	public abstract GlassBuilder addSodaAsh();
	public abstract GlassBuilder addLimeStone();
	public abstract GlassBuilder addRecycledGlass();
	public abstract GlassBuilder addSilica();

	public Glass build() {
		Glass glass = new Glass();
		glass.setName(this.name);
		glass.addMaterials(materials);
		return glass;
	}
}
