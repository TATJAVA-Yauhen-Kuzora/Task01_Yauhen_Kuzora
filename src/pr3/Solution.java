package pr3;

import pr3.DialogMessages;

public class Solution {
	private RightTriangle triangle;
	private ConsoleHelper helper = new ConsoleHelper();

	public void start() {
		double a, b;
		a = helper.inputTriangeSide(DialogMessages.INPUT_A.getMess());
		b = helper.inputTriangeSide(DialogMessages.INPUT_B.getMess());
		triangle = new RightTriangle(a, b);
		helper.printArg(DialogMessages.PERIMERT.getMess(), triangle.getPerim());
		helper.printArg(DialogMessages.SQUARE.getMess(), triangle.getSquare());
	}
}