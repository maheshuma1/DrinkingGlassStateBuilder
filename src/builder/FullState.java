package builder;

public class FullState implements State {
	GlassStates glassState;
	public FullState(GlassStates glassState) {
		this.glassState = glassState;
	}



	@Override
	public void halfFill() {
		System.out.println("Half the glass of liquid");
		glassState.setState(glassState.getHalfState());
	}

	@Override
	public void fullFill() {
		System.out.println("The glass is already full");
	}

	@Override
	public void cleanGlass() {
		System.out.println("Glass is clean");
	}

	@Override
	public void dirtyGlass() {
		System.out.println("Make the glass dirty");
		glassState.setState(glassState.getDirtyState());
	}
	public String toString() {
		return " full state";
	}
	@Override
	public void emptyGlass() {
		System.out.println("Empty the glass");
		glassState.setState(glassState.getEmptyState());

		GlassBuilder wineGlassBuilder = new WineGlassBuilder();
		Glass wineGlass = wineGlassBuilder.addAcrylic().addLimeStone().addRecycledGlass()
				.addSilica().addSilicone().addSodaAsh().build();
		wineGlass.prepare();
		wineGlass.melting();
		wineGlass.tinFloatBath();
		wineGlass.annealing();
		wineGlass.qualityInspection();
		wineGlass.cutting();
		wineGlass.coating();

		wineGlass.dispatch();

		System.out.println(wineGlass);

		GlassBuilder beerGlassBuilder = new BeerGlassBuilder();
		Glass beerGlass = beerGlassBuilder.addAcrylic().addLimeStone().addRecycledGlass()
				.addSilica().addSilicone().addSodaAsh().build();
		beerGlass.prepare();
		beerGlass.melting();
		beerGlass.tinFloatBath();
		beerGlass.annealing();
		beerGlass.qualityInspection();
		beerGlass.cutting();
		beerGlass.coating();

		beerGlass.dispatch();

		System.out.println(beerGlass);


	}
}
