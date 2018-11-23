package Modelo;

public class Amigos {

		private int player1;
		private int player2;
		public int getPlayer1() {
			return player1;
		}
		public void setPlayer1(int player1) {
			this.player1 = player1;
		}
		public int getPlayer2() {
			return player2;
		}
		public void setPlayer2(int player2) {
			this.player2 = player2;
		}
		public Amigos(int player1, int player2) {
			super();
			this.player1 = player1;
			this.player2 = player2;
		}
		public Amigos() {
			super();
		}
		@Override
		public String toString() {
			return "Amigos [player1=" + player1 + ", player2=" + player2 + "]";
		}
	
		
}
