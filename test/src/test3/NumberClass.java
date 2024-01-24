package test3;

public class NumberClass implements DefaultMethod{
	
	int mynumber = 0;
	
	@Override
	public void setNumb(int numb) {
		this.mynumber = numb;
		System.out.println("숫자설정합니당");
	}
	

}
