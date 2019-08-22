package janken;
import java.util.Scanner;

public class Janken {
	public static void  main(String[] args) {
		int m = 0;
		int e = 0;
		while(true) {
			System.out.println( m + e);
			System.out.println("手を入力してください");
			System.out.println("1:グー, 2:パー, 3: チョキ");

//			自分の手入力
			int me = new Scanner(System.in).nextInt();
//			相手の手決定
			int enemy = new java.util.Random().nextInt(4);
//			手の判定
			System.out.println("あなたの手は" + judge(me) +"です");
			System.out.println("てきの手は" + judge(enemy) +"です");
//			勝敗判定
			if(me == enemy) {
				System.out.println("あいこです");
			}else if((me == 1 && enemy == 3) || (me == 2 && enemy == 1) || (me == 3 && enemy == 2)){
				System.out.println("あなたの勝ちだ！  (*ﾟ▽ﾟ)/ﾟ･:*【祝】*:･ﾟ＼(ﾟ▽ﾟ*)");
				m++;
			}else {
				System.out.println("お前の負けだ　( `д´)、ﾍﾟｯﾍﾟｯ");
				e++;
			}
			if(m + e == 5) {
				break;
			}
		}

		System.out.println("あなたの戦績 : " + m + "勝," +  e+ "負");
		if (m > e) {
			System.out.println("あなたの勝ちだーーー！！！");
			System.out.println("ヽ(´□｀。)ﾉ・ﾟﾔｯﾀｱｧｧｱｧﾝ.");
		}else {
			System.out.println("お前の負けだ");
			System.out.println("ｶｰｯ(ﾟДﾟ≡ﾟдﾟ)､ﾍﾟｯ ( ﾟдﾟ)､ﾍﾟｯﾍﾟｯﾍﾟｯﾍﾟｯﾍﾟｯﾍﾟｯﾍﾟｯﾍﾟｯﾍﾟｯ");
		}
	}

	public static String judge(int te) {
		String my_te = "";
		if(te == 1) {
			my_te = "グー";
		}else if(te == 2) {
			my_te = "パー";
		}else {
			my_te = "チョキ";
		}
		return my_te;

	}
}
