package String;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		p.setAge(22);
		System.out.println(p.getAge());
	}
		private int age;
		public void setAge(int age)
		{
			if(age>=0)
			{
				this.age=age;
			}
		}
		public int getAge()
		{
			return age;
		}

	}


