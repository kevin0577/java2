package classMethod;

import classMethod.human.Human02;
import classMethod.human.Human03;

public class Main {
	public static void main(String[] args) {
		Human02 yamada = new Human02();  //Human02クラスのインスタンスを生成
	    System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

	    Human02 sato = new Human02("佐藤", 25); //Human02クラスのインスタンスを生成
	    System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");

	    Human03 yamada2 = new Human03();

        System.out.println("私の名前は、" + yamada2.name + "です。");
        String profile = yamada2.getProfile();
        System.out.println(profile + "です。");

        yamada2.greet("田辺");
        yamada2.greet(null);
	}
}
