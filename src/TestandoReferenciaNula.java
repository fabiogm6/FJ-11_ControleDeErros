
public class TestandoReferenciaNula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Contat c = null; vai dar Pau ! checked error
		Contat c = new Contat();
		System.out.println("Saldo atual " + c.getSaldo());
	}
}
