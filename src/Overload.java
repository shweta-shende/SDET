
public class Overload {
	
	
		int a,b;
		public float area(int a,int b) {
			float area=a*b;
			return area;
		}
		public double area(float a,int b)
		{
			double area=0.5*a*b;
			return area;
		}
		public double area (float r )
		{
			double area=3.14*r*r;
			return area;
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload obj=new Overload();
		obj.area(6);
		obj.area(8,9);
		
		

	}

}
