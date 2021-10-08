package builder;

public class BeerGlassBuilder extends GlassBuilder{

	public BeerGlassBuilder() {
		this.name = "Beer Glass";
	}
	public GlassBuilder addAcrylic() {
		return this;
	}
	public GlassBuilder addSilicone() {
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
		this.materials.add("Recycled Glass");
		return this;
	}
	public GlassBuilder addSilica() {
		this.materials.add("Silica");
		return this;
	}

}
