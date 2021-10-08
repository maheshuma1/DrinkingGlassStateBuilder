package builder;

public class DirtyState implements State {
	GlassStates glassState;
	public DirtyState(GlassStates glassState) {
		this.glassState = glassState;
	}

	@Override
	public void emptyGlass() {
		System.out.println("Emptying dirty glass");
		glassState.setState(glassState.getEmptyState());
	}

	@Override
	public void halfFill() {
		System.out.println("Glass is dirty clean it first to half fill");
	}

	@Override
	public void fullFill() {
		System.out.println("Glass is dirty clean first to fill");
	}

	@Override
	public void cleanGlass() {
		System.out.println("Cleaning dirty glass");
		glassState.setState(glassState.getCleanState());
	}

	@Override
	public void dirtyGlass() {
		System.out.println("The glass is dirty");
	}
	public String toString() {
		return " dirty state";
	}
}
