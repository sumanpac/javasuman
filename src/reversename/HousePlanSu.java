package reversename;

public class HousePlanSu {
	
	int noOfRooms;
	int noOfBals;
	
	public static void main(String[] args)
	{
		
	System.out.println("house plan class");
		
		HousePlanSu house1 = new HousePlanSu();
		
		house1.noOfRooms = 2;
		house1.noOfBals = 2;
		
		System.out.println(" House1 rooms: " + house1.noOfRooms);
        System.out.println("house1 no of Balconies:" + house1.noOfBals);
        
        System.out.println("\n");

		  HousePlanSu house2 = new HousePlanSu();
		house2.noOfRooms =3;
		house2.noOfBals =3; 
		
		System.out.println("House2 rooms" + house2.noOfRooms);
		System.out.println("house2 no of Balconies are :"+ house2.noOfBals);
		
			
	}
}

