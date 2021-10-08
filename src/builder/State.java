package builder;

public interface State {
	public void emptyGlass();
	public void halfFill();
	public void fullFill();
	public void cleanGlass();
	public void dirtyGlass();
}
