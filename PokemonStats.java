public class PokemonStats {
	public static void main(String [] args) {
		System.out.println("This is Blastoise now");
		System.out.println("This pokemon at level 100 has" + " hp of " + hp(79));
		System.out.println("This pokemon at level 100 has" + " attack of " + attack(83));
		System.out.println("This pokemon at level 100 has" + " defense of " +  defense(100));
		System.out.println("This pokemon at level 100 has" + " special attack of " + specialattack(85));
		System.out.println("This pokemon at level 100 has" + " special defense of " + specialdefense(105));
		System.out.println("This pokemon at level 100 has" + " speed of " + speed(78));
		System.out.println("This is Raichu now");
		System.out.println("This pokemon at level 100 has" + " hp of " + hp(60));
		System.out.println("This pokemon at level 100 has" + " attack of " + attack(90));
		System.out.println("This pokemon at level 100 has" + " defense of " +  defense(55));
		System.out.println("This pokemon at level 100 has" + " special attack of " + specialattack(90));
		System.out.println("This pokemon at level 100 has" + " special defense of " + specialdefense(80));
		System.out.println("This pokemon at level 100 has" + " speed of " + speed(110));
		}
	public static int hp(int hp) {
		return (2*hp) + 110;
	}
	public static int attack(int attack) {
		return (2*attack) + 5;
	}
	public static int defense(int defense) {
		return (2*defense) + 5;
	}
	public static int specialattack(int specialattack) {
		return (2*specialattack) + 5;
	}
	public static int specialdefense(int specialdefense) {
		return (2*specialdefense) + 5;
	}
	public static int speed(int speed) {
		return (2*speed) + 5;
	}
}