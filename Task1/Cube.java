package fareselsadek777;

public class Cube extends Shapes {
	private int lenght;
	private int width;
	
	
	public int getLenght() {
		return lenght;
	}
	
	
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	
		public int CubeVolume()
		{
			int Volume=getLenght()*getHeight()*getWidth();
			return Volume;
		}
		
		public int RemainingCube()
		{
			int Volume=CubeVolume();
			return Volume-getFilled();
		}
		
	
	
	

}
