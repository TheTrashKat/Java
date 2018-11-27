package Modelo;

public class Amigos {

		private int player1;
		private int player2;
		private String player_2_name;
		
		public Amigos(int player1, int player2, String player_2_name) {
			super();
			this.player1 = player1;
			this.player2 = player2;
			this.player_2_name = player_2_name;
		}
		public String getPlayer_2_name() {
			return player_2_name;
		}
		public void setPlayer_2_name(String player_2_name) {
			this.player_2_name = player_2_name;
		}
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
			return "Amigos [player1=" + player1 + ", player2=" + player2 + ", player_2_name=" + player_2_name + "]";
		}
	
		
}
