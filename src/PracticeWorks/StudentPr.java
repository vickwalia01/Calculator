package PracticeWorks;

public class StudentPr {


	int sid;
	String sname;
	double marks;
	
	StudentPr(int id, String name, double m)// constructor
	{
		sid=id;
		sname=name;
		marks=m;
	}
	void display()
	{
		System.out.println(sid+" "+sname+" "+marks);	
	}

}
