package builder;

public class WineGlassBuilder extends GlassBuilder{

	public WineGlassBuilder() {
		this.name = "Wine Glass";
	}
	public GlassBuilder addAcrylic() {
		this.materials.add("Acrylic");
		return this;
	}
	public GlassBuilder addSilicone() {
		this.materials.add("Silicone");
		return this;
	}
	public GlassBuilder addSodaAsh() {
		this.materials.add("Soda Ash");
		return this;
	}
	public GlassBuilder addLimeStone() {
		this.materials.add("Limestone");
		return this;
	}
	public GlassBuilder addRecycledGlass() {
		return this;
	}
	public GlassBuilder addSilica() {
		this.materials.add("Silica");
		return this;
	}

}