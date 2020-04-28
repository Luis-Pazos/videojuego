package net.instituto.desa;

public class Game {
		private static final String ABAJO = "Down";
		private static final String ARRIBA = "Up";
		private static final String IZQUIERDA = "Left";
		private static final String DERECHA = "Right";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase("Derecha")) {
			j.setX(j.getX() + 1);
		}
		if (m.equalsIgnoreCase("Izquierda")) {
			j.setX(j.getX() - 1);
		}
		if (m.equalsIgnoreCase("Arriba")) {
			j.setY(j.getY() - 1);
		}
		if (m.equalsIgnoreCase("Abajo")) {
			j.setY(j.getY() + 1);
		}
	}
	
	public void Down() {
		j.setY(j.getY() + 1);
	}

	public void Up() {
		j.setY(j.getY() - 1);
	}

	public void Left() {
		j.setX(j.getX() - 1);
	}

	public void Right() {
		j.setX(j.getX() + 1);
	}
	
}
