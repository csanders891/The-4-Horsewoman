package four_horsewomen;

public class FourHorsewomen {
	enum horsewomen{CHARLOTTE, BECKY, BAYLEY, SASHA};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		horsewomen theQueen=horsewomen.CHARLOTTE;
		horsewomen theMan=horsewomen.BECKY;
		horsewomen theHugger=horsewomen.BAYLEY;
		horsewomen theBoss=horsewomen.SASHA;
		
		System.out.println("The 4 Horsewomen are:");
		System.out.println(theQueen);
		System.out.println(theMan);
		System.out.println(theHugger);
		System.out.println(theBoss);
	}

}
