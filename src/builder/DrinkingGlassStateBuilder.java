package builder;

public class DrinkingGlassStateBuilder {

	public static void main(String[] args) {
		GlassStates glassStates = new GlassStates();

		System.out.println(glassStates);

		glassStates.cleanGlass();
		glassStates.halfFill();
		glassStates.fullFill();
		glassStates.emptyGlass();
		
		

	}

}
