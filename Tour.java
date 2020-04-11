import java.util.Scanner;
class Ujjwal 
{
    String destination;
    int tour_package;
    String hotelfacility;
    int hotel;
    int price;
    Ujjwal(String destination,int tour_package,String hotelfacility,int hotel,int price)
	{
		this.destination=destination;
        this.tour_package=tour_package;
        this.hotelfacility=hotelfacility;
		this.hotel=hotel;
		this.price=price;   
    }
    public String getdestination()
	{
		return this.destination;
	}
    public void setdestination(String destination)
	{
		this.destination=destination;
	}
    public  int gettour_package()
	{
		return this.tour_package;
	}
    public void settour_package(int tour_package)
	{
		this.tour_package=tour_package;
	}
    public  String gethotelfacility()
	{ 
		return this.hotelfacility;
	}
    public void sethotelfacility(String hotelfacility)
	{
		this.hotelfacility=hotelfacility;
	}
    public  int gethotel()
	{
		return this.hotel;
	}
    public void sethotel(int hotel)
	{
		this.hotel=hotel;
	}
    public  int getprice()
	{
		return this.price;
	}
    public void setprice(int price)
	{
		this.price=price;
	}
    public  void display()
	{
       System.out.println("Place of travel : "+ getdestination());
       System.out.println("Package that you have selected : "+ gettour_package()+" nights");
       System.out.println("Hotel Facility: "+ gethotelfacility());
       System.out.println("Hotel Category: "+ gethotel()+ " Star");
       System.out.println("Final Price : "+ getprice());
	}  
}
class Kumar
{
	Scanner sc = new Scanner(System.in);
	void addtraveller()
    {
		int ln,price;
		System.out.println("Where you want to go? \n Goa \n Manali");
		String input = sc.next();
		{
	        if(input.equals("Goa"))
			{
				System.out.println("Please select tour package 2 or 3 \n 2 nights = 20000 \n 3 nights = 18000: ");
				ln= sc.nextInt();
				{
					if(ln==2)
					{
						price=20000;
					}	
					else
					{
						price=16000;
					}	
				}
			}
			else if(input.equals("Manali"))
			{
				System.out.println("Please select tour package 2 or 3 \n 2 nights = 20000 \n 3 nights = 18000: ");
				ln= sc.nextInt();
				{
					if(ln==3)
					{
						price=18000;
					}	
					else
					{
						price=16000;
					}	
				}
			}
		    else
			{
				System.out.println("Please select tour package 2 or 3 \n 2 nights = 12000 \n 3 nights = 15000: ");
				ln=  sc.nextInt();
				{
					if(ln==2)
					{
						price=10000;
					}
					else
					{
						price=12000;
					}
				}
			}
			System.out.println("Do you want the hotel facility \n Yes or No :");
			String fac= sc.next();
			System.out.println("Select the hotel category you want to stay 4 star or 5 star\n 4 or 5");
			int want=  sc.nextInt();
			if(want==4)
			{
				System.out.println("Enter the number of nights you want to add in your pacakge otherwise if no then enter Zero");
				int nights = sc.nextInt();
				if(nights == 1) 
				{
					price = price + 750 + (nights * 1000);
				}
				if(nights == 2) 
				{
					price = price + 1500 + (nights * 1000);
				}
				if(nights == 3) 
				{
					price = price + 2000 + (nights * 1000);
				}
				else
				{
					price = price + 100 + (nights * 200);
				}
			}
			if(want==5)
			{
				System.out.println("Enter the number of nights you want to add in your pacakge otherwise if no then enter Zero");
				int nights = sc.nextInt();
				if(nights == 1) 
				{
					price = price + 750 + (nights * 1000);
				}
				if(nights == 2) 
				{
					price = price + 1500 + (nights * 1000);
				}
				if(nights == 3) 
				{
					price = price + 2000 + (nights * 1000);
				}
				else
				{
					price = price + 100 + (nights * 200);
				}
			}
			Ujjwal obj=new Ujjwal(input,ln,fac,want,price);
			obj.display();
		}
	}
}
class UjjwalKumar
{
	public static void main(String args[]) 
	{
		// TODO Code logic started here
		Scanner sc = new Scanner(System.in);
        Kumar kr = new Kumar();
        int ch;
        while(true) 
		{
			System.out.println("Enter 1 for selecting the Tour Package \nEnter 2 for Exit");
            ch = sc.nextInt();
            switch (ch) 
			{
				case 1:
					kr.addtraveller();
					break;
				case 2:
					System.exit(0);
				default:
					System.out.println("Enter the option 1 or 2");
            }//end of switch
        }//end of while	
	}
}