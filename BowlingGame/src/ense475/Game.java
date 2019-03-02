 package ense475; 
 
 
 public class Game {
	//private int score = 0; 
	private int[] rolls = new int[21];
	private int currentRoll = 0;;
	
	 public void roll(int pins) {
		 //score += pins;
		 rolls[currentRoll++] = pins;
	 }
	 
	 public int score() {
		 int score = 0, frame = 0, index = 0;
		 
		 for (frame = 0; frame < 10; frame++) {
			 if(isSpare(index)) {
				 score += 10 + rolls[index + 2];
				 index += 2;
			 }
			 
			 else {
				 score += rolls[index] + rolls [index + 1];
				 index += 2;
			 }
		 }
		 
		 return score;
	 }
	 
	 private boolean isSpare(int index) {
		 return rolls[index] + rolls[index + 1] == 10;
	 }
 }