package JavaCodes;

public class DatatypeVartypeModType {
	public int intNumber = 60;
	public float floatNo = (float)6.3673;
	public double doubleNo = 2.2477;
	public char charLet = 'A';
	protected short shortNo = -1265;
	protected long lngNo = 101825639;
	public static int statInt;
	private final boolean curStat = true;
	final static String COMPANY_NAME = "ISS Governance";
	
	public static void main(String[] args) {
		System.out.println("--------- No need to create an Object instance for 'static' objects ---------");
		System.out.println("Interger in static method :\t" + statInt );
		System.out.println("String in static method   :\t" + COMPANY_NAME + "");
		
		DatatypeVartypeModType dataObject = new DatatypeVartypeModType();
		System.out.println("Double datatype (public)   :\t" + dataObject.doubleNo );
		System.out.println("Float datatype (public)    :\t" + dataObject.floatNo );
		System.out.println("Char datatype (public)     :\t" + dataObject.charLet );
		System.out.println("Short datatype (protected) :\t" + dataObject.shortNo );
		System.out.println("Long datatype (protected) :\t" + dataObject.lngNo );
		System.out.println("Boolean datatype (private) :\t" + dataObject.curStat );
	}

}
