package builder;

public class HalfState implements State {
	GlassStates glassState;
	public HalfState(GlassStates glassState) {
		this.glassState = glassState;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Empty the glass");
		glassState.setState(glassState.getEmptyState());
	}

	@Override
	public void halfFill() {
		System.out.println("The glass is already half");
	}

	@Override
	public void fullFill() {
		System.out.println("Fill the glass");
		glassState.setState(glassState.getFullState());
	}

	@Override
	public void cleanGlass() {
		System.out.println("First empty the glass");
	}

	@Override
	public void dirtyGlass() {
		System.out.println("Smudge the glass");
		glassState.setState(glassState.getDirtyState());
	}
	public String toString() {
		return " half state";
	}
}
