import java.util.Stack;

class VariableCoins{
	static int COIN_MAX_VALUE = 6;
	static int AMOUNT_OF_COINS = 4;
}

public class FourOutOfSixCoins {
	public Stack<Integer> coins = new Stack<>();
			public int[]besetzt=new int[VariableCoins.COIN_MAX_VALUE];
			public static int counter = 0;
			
	public void generatePermutation() {
		if(this.coins.size() == VariableCoins.AMOUNT_OF_COINS) {
			counter++;
			System.out.print(counter);
			System.out.println(this.coins.toString());
		}
		else {
			for	(int i=1; i <= VariableCoins.COIN_MAX_VALUE; i++) {
				if (this.besetzt[i - 1] == 1) continue;
				this.coins.push(i);
				this.generatePermutation();
				this.coins.pop();
				this.besetzt[i - 1] = 0;
			}
		}
	}
	public static void main(String[] args) {
		FourOutOfSixCoins test = new FourOutOfSixCoins();
		test.generatePermutation();
		System.out.println("\n Die Kombinationen sind:" +counter);
	}

}
