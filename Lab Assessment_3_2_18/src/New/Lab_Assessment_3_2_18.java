package New;

public class Lab_Assessment_3_2_18 {
	
	public static void Main(String args[]){
		
		
	}
	
	public class Numers{
		int num = 0;
		
	}
	
	public static boolean isGoofy(int num){
		Boolean a = true;
		
		int digits = 1, place = num;
		
		if(num/10<1 && num%2 == 0){
			a = false;
			return a;
		}
		else if(num/10<1 && num%2 == 1){
			a = true;
			return a;
		}
		while (place>10){
			place -= 10;
			digits++;
		}
		int[] Goof = new int[digits];
		for (int i = 0; i < num; i++){
			if((digits+place)%2 ==0){
				
			}
			if(num == 0){
				
			}
			if((num/10)>1){
				digits++;
			}
			num = 1 ;
		}
		
		return a;
	}
	//out.println("The call " + "would return "+ a+"as "+num+" has digit divisors that are " );
	
	int count = 0;
	
	public static int[] getSomeGoofyNumbers(int count){
		
		run.isGoofy();
		int[] giveNumb = new int[count];
		int[] Numbs = {1,3,5,7,9,10,12,13,14,16,17,18,19,21,25,27,29,30};
		for(int k = 0; k< count; k++){
			giveNumb[k] = Numbs[k];
				
			return giveNumb;
		}
		
		
		return giveNumb;
	}
	
	
	
	
	
	
	
	
	
	
}
