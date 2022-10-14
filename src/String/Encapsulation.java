package String;

public class Encapsulation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.setEmpid(102);
		System.out.println(e.getEmpid());
		
		

	}

	
	
	private int empid;
	public void setEmpid(int eid)
	{
		empid=eid;
	}
		public int getEmpid()
		{
			return empid;
		}
}


