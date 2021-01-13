package constants;

public class Main {
	public static void main(String[] args) {
	    class Cat {
	        public static final String NAME = "猫";
	        public static final int LEG_COUNT = 4;
	    }

	    class Octopus {
	        public static final String NAME = "タコ";
	        public static final int LEG_COUNT = 8;
	    }

	    System.out.println(Cat.NAME);
	    System.out.println(Cat.LEG_COUNT);
	    System.out.println(Octopus.NAME);
	    System.out.println(Octopus.LEG_COUNT);
	}
}
