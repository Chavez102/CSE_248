package p1;

public class EnemyShipFactory {
	public EnemyShip makeEnemyShipt(String newShipType) {
		EnemyShip newShip=null;
		if(newShipType.contentEquals("U")) {
			return new UFOEnemyShip();
		}else if(newShipType.contains("R")) {
			return new RocketEnemyShip();
		}else if(newShipType.contains("H")) {
			return new HugeUFOEnemyShip();
		}else {
		return null;
		}
	}

}
