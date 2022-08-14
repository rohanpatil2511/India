package MethodStudy;

public class NonStaticRegular {

	public static void main(String[] args) 
	{
				
     NonStaticRegular a=new NonStaticRegular(); // Classname objectname=new Classname(); --- Non static Regular Method from same class.
     
     a.arrange(); //  Objectname.Methodname----Non static method from same class.
     
     StaticRegular.practice();   // Classname.Methodname -- Calling Static Regular method from Another class
     
     MainNonstatic s=new MainNonstatic();
     
     s.Memory();  //------ Calling Non static Regular Method from another class
     
     practice();  //------ Static Regular Method from Same class
	}


	public static void practice() {
		// TODO Auto-generated method stub
		
	}


	public void arrange()
	
	{
		System.out.println("This is my new Static method from same class");
		
	}
	
}
