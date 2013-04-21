package principal;
import basicIngredients.*;
import ingredients.*;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
	
	public Clams createClam() {
		return new FreshClams();
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
}
