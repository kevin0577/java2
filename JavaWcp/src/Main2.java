
public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 10;
        if (number < 5) {
            System.out.println(number + " は5未満です");
        } else if (number < 10) {
            System.out.println(number + " は5以上、10未満です");
        } else if (number < 15) {
            System.out.println(number + " は10以上、15未満です");
        } else {
            System.out.println(number + " は15未満でないです");
        }

        int val = 4;
        switch (val) {
        case 3:
        	System.out.println("よくできました");
        	break;
        case 2:
        	System.out.println("普通でした");
        	break;
        default:
        	System.out.println("頑張ろう");
        }

        int i = 1;
        if (i < 5) {
        	System.out.println("とても近い");
        } else if (i < 10) {
        	System.out.println("近い");
        } else if (i < 15) {
        	System.out.println("遠い");
        } else {
        	System.out.println("とても遠い");
        }
	}

}
