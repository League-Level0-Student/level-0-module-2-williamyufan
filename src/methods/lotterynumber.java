package methods;

import java.util.Random;

public class lotterynumber { public static void main(String[] args) {
	
	Random gen=new Random();
	int num=gen.nextInt(100);
	
	Random gen1=new Random();
	int num1=gen1.nextInt(60);
	
	Random gen2=new Random();
	int num2=gen1.nextInt(70);
	
	Random gen3=new Random();
	int num3=gen.nextInt(58);
	
	Random gen4=new Random();
	int num4=gen.nextInt(89);

	

	System.out.println(num+ "," +num1+ "," +num2+ "," +num3+ "," +num4);
}

}
