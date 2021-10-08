package builder;

public class EmptyState implements State {
	GlassStates glassState;
	public EmptyState(GlassStates glassState) {
		this.glassState = glassState;
	}

	@Override
	public void emptyGlass() {
		System.out.println("The glass is empty");
	}

	@Override
	public void halfFill() {
		System.out.println("Half fill the glass");
		glassState.setState(glassState.getHalfState());
	}

	@Override
	public void fullFill() {
		System.out.println("Fill the glass");
		glassState.setState(glassState.getFullState());
	}

	@Override
	public void cleanGlass() {
		System.out.println("The Glass is not dirty");
	}

	@Override
	public void dirtyGlass() {
		System.out.println("Smudge the glass with dirt");
		glassState.setState(glassState.getDirtyState());
	}
	public String toString() {
		return " empty state";
	}
}
