package builder;

public class GlassStates {
	State dirtyState;
	State cleanState;
	State halfState;
	State fullState;
	State emptyState;
	State state;
	public GlassStates() {
		dirtyState = new DirtyState(this);
		cleanState = new CleanState(this);

		halfState = new HalfState(this);
		fullState = new FullState(this);
		emptyState = new EmptyState(this);

		state = dirtyState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void  cleanGlass() {
		state.cleanGlass();
	}
	public void dirtyGlass() {
		state.dirtyGlass();
	}
	public void emptyGlass() {
		state.emptyGlass();
	}
	public void fullFill() {
		state.fullFill();
	}
	public void halfFill() {
		state.halfFill();
	}
	public State getDirtyState() {
		return dirtyState;
	}
	public State getCleanState() {
		return cleanState;
	}
	public State getHalfState() {
		return halfState;
	}
	public State getFullState() {
		return fullState;
	}
	public State getEmptyState() {
		return emptyState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("\nSaint-Gobain India Pvt Ltd \n");

		result.append("Glass is " + state + "\n");

		return result.toString();
	}

}
