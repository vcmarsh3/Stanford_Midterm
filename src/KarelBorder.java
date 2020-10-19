
public class KarelBorderextends SuperKarel {

		public void run() {
			checkRow();
			while (leftIsClear()) {
				moveToNextRow();
				checkRow();
			}
		}

		private void moveToNextRow() {
			turnLeft();
			move();
			turnRight();
		}

		private void checkRow() {
			if (frontIsClear()) {
				goToBeeper();
				while (beepersPresent()) {
					bringBeeperHome();
					goToBeeper();
		}
		turnAround();
		moveToWall();
		turnAround();
		}
	}
	
		private void goToBeeper() {
			move();
			while (frontIsClear() && noBeepersPresent()) {
				move();
			}
		}

		private void bringBeeperHome() {
			pickBeeper();
			turnAround();
			moveToWall();
			turnAround();
			putBeeper();
		}
	
		private void moveToWall() {
			while (frontIsClear()) {
				move();
			}
		}
	}

