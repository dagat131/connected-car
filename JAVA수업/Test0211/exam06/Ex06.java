package exam06;

public class Ex06 {
	String name;
	int gug;
	int mat;
	int eng;
	int all;
	double avg;
	
	public Ex06(String name, int gug, int mat, int eng){
		this.name = name;
		this.gug = gug;
		this.mat = mat;
		this.eng = eng;
		this.all = gug + mat + eng;
		this.avg = (double)all / 3;
		
	}
	public void display() {
		System.out.println(name + "\t" + gug + "\t" + mat + "\t" + eng + "\t" + all + "\t" + avg);
	}
}
