package builder;

public class CleanState implements State {
	GlassStates glassState;
	public CleanState(GlassStates glassState) {
		this.glassState = glassState;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Emptying the glass");
		glassState.setState(glassState.getEmptyState());
	}

	@Override
	public void halfFill() {
		System.out.println("Half Fill glass");
		glassState.setState(glassState.getHalfState());
	}

	@Override
	public void fullFill() {
		System.out.println("Full fill the glass");
		glassState.setState(glassState.getFullState());

	}

	@Override
	public void cleanGlass() {
		System.out.println("The Glass is already clean");

	}

	@Override
	public void dirtyGlass() {
		System.out.println("Smudge glass with dirt or oil");
		glassState.setState(glassState.getDirtyState());

	}
	public String toString() {
		return " clean state";
	}
}
