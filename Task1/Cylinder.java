package fareselsadek777;



public class Cylinder extends Shapes {
	public Double pi=3.14;
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	 public Double CylinderVolume()
		{
			Double Volume=(double)pi*getHeight()*getRadius()*getRadius();
			return Volume;
		}
		
		public Double RemainingCylinder()
		{
			Double Volume=CylinderVolume();
			return Volume-getFilled();
			
		}
	
	
		
       
		
	
	

}
