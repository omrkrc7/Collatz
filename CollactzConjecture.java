import java.util.Scanner;
class CollactzConjecture{
private static int counter = 0;
public static void main(String[] args){
	CollactzConjecture c = new CollactzConjecture();
	Scanner sc = new Scanner(System.in);
	long number = sc.nextLong();
	long startTime = System.currentTimeMillis();
	c.collactz(number);
	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime ;
	System.out.println("Took "+ totalTime + " miliseconds");
}
public void collactz(long number){
	
	if(number%2 == 0){
		number = number/2 ;
		counter++ ;
		System.out.println("step: " +counter+ " Number is : " + number);
		collactz(number);
	}
	else if (number == 1){
		counter++;
		System.out.println("At this point infinite loop will start.");
		System.out.println("Took " +counter+ " steps");
	}
	else{
		number = (3 * number) + 1;		
		counter++;
		System.out.println("step: " +counter+ " Number is : " + number);
		collactz(number);
	}
}


}