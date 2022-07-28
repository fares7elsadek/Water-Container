package fareselsadek777;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int ContainerNumber=0;
		System.out.println("Enter Number of Containers :");
		Scanner scanner = new Scanner(System.in);
		
		ContainerNumber= scanner.nextInt();
		
		ArrayList< Double > Volume = new ArrayList< Double >();
		ArrayList< Double > Remaining = new ArrayList< Double >();
		
		Cube cube = new Cube();
		Cylinder cylinder =new Cylinder();
		int n=ContainerNumber;
		
		while(ContainerNumber>0)
		{
			int i;
			System.out.println("Enter 1 to Create a Cylinder , and 2 to Create Cube :");
			i=scanner.nextInt();
			if(i==1)
			{
				int height;
				int radius;
				int filled;
				System.out.print("Enter radius : ");
				radius=scanner.nextInt();
				cylinder.setRadius(radius);
				System.out.print("Enter height : ");
				height=scanner.nextInt();
				cylinder.setHeight(height);
				System.out.print("Enter filled amount of cubic meter : ");
				filled=scanner.nextInt();
				cylinder.setFilled(filled);
				
				Volume.add(cylinder.CylinderVolume());
				Remaining.add(cylinder.RemainingCylinder());
				
			}
			else
			{
				
				int lenght;
				int height;
				int width;
				int filled;
				System.out.print("Enter lenght : ");
				lenght=scanner.nextInt();
				cube.setLenght(lenght);
				System.out.print("Enter height : ");
				height=scanner.nextInt();
				cube.setHeight(height);
				System.out.print("Enter width : ");
				width=scanner.nextInt();
				cube.setWidth(width);
				System.out.print("Enter filled amount of cubic meter : ");
				filled=scanner.nextInt();
				cube.setFilled(filled);
				
				Volume.add((double)cube.CubeVolume());
				Remaining.add((double)cube. RemainingCube());
				
			}
			ContainerNumber--;
			System.out.println("\n\n");
			
			
		}
		System.out.println("#output \n\n");
		
		for(int i=0;i<Remaining.size();i++)
		{
			for(int j=i+1 ;j<Remaining.size();j++)
			{
				if(Remaining.get(i)>Remaining.get(j))
				{
					Collections.swap(Remaining, i, j);
					Collections.swap(Volume, i, j);
				}
				
				
			}
			
		}
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d:",i+1);
			System.out.println("\n");
			System.out.printf("Volume : %f  \t\t Reamaining : %f ",Volume.get(i),Remaining.get(i));
			System.out.println("\n");
		}
		
		

	}

}
