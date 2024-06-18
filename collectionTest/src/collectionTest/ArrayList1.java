package collectionTest;

import java.util.*;


public class ArrayList1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<Integer>(5);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter " +i +" Marks :: ");
			int input=sc.nextInt();
			l1.add(input);
		}
		
		System.out.println("Size of Array :: "+l1.size());
		
		System.out.println(l1);
		
		System.out.println("Element in array list ");
		l1.forEach(ele -> System.out.println(ele));
	}

}
