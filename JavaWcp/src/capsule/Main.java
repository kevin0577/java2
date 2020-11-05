package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Main {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 23);
		System.out.println("名前は" + human1.getName() + ", 年齢は" + human1.getAge() + "です。");

		HumanCapsule human2 = new HumanCapsule("加藤", 25);
		System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
		human2.setName("佐藤");
        System.out.println("変更した名前は" + human2.getName() + "です。");
	}
}
