package Assignment;

public class HierarchicalI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google g=new Google();
		g.Account();
		System.out.println("---------------------");
		Gmail g1=new Gmail();
		g1.Account();
		g1.ComposeMail();
		System.out.println("---------------------");
		GoogleDrive g2=new GoogleDrive();
		g2.Account();
		g2.uploadFile();
		
		System.out.println("---------------------");
		YouTube y=new YouTube();
		y.Account();
		y.uploadVedio();
		System.out.println("---------------------");

	}

}
class Google
{
	void Account()
	{
		System.out.println("google account is mandatory");
	}
	}
class Gmail extends Google
{
	void ComposeMail()
	{
		System.out.println("you can compose mail now ");
	}
	}
class GoogleDrive extends Google
{
	void uploadFile()
	{
		System.out.println("you can upload file now ");
	}
	}
class YouTube extends Google
{
	void uploadVedio()
	{
		System.out.println("you can upload vedio now ");
	}
	}
