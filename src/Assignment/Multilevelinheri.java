package Assignment;

public class Multilevelinheri {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instagram1 v1=new Instagram1();
		v1.uploadPhoto();
		System.out.println("---------------------------------");
		Instagram2 v2=new Instagram2();
		v2.uploadPhoto();
		v2.uploadStory();
		System.out.println("---------------------------------");
		Instagram3 v3=new Instagram3();
		v3.uploadPhoto();
		v3.uploadStory();
		v3.uploadReels();
		
		

	}
}
	class Instagram1
	{
		void uploadPhoto()
		{
			System.out.println("upload photo from v1");
		}
		
	}
	class Instagram2 extends Instagram1
	{
		void uploadStory()
		{
			System.out.println("upload story from v2");
		}
		
	}
	class Instagram3 extends Instagram2
	{
		void uploadReels()
		{
			System.out.println("upload reels from v3");
		}
		
	}


	

	


