package exam05;

public class Ex05 {
	//�������  ->> ��������
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	//������ - �⺻������  --> �������� �� �� ����.  �Ű������� �޶����.  �ڵ����� �����̵�.
//	public Ex05() {
//	}
	
	
//	"ȫ�浿", 90, 80, 70
	public Ex05(String name, int kor, int eng, int mat) { //�Ű�����  ->> ��������  / �°� �Է��ʿ�
		this.name = name;    // ���� ������ �������� / ���� ������ ��������
		this.kor = kor;		 // ���� ����� �������� / ���� ������ ��������
		this.eng = eng;		 // ���� ����� �������� / ���� ������ ��������
		this.mat = mat;		 // ���� ������ �������� / ���� ������ ��������
		tot = kor + eng + mat;
		avg = (double) tot / 3;
	}
}
