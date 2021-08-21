package OOP_1_exam;


public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int Total;
	float Average;
	
	
	
	public int getTotal() {
		Total = kor +eng + math;
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public float getAverage() {
		Average = Total/3f;
		return Average;
	}

	public void setAverage(float average) {
		Average = average;
	}

	public Student ()  {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}
	
	public String info () {
		int sum = kor+eng+math;
	float avg = sum/3f ;
		
		return name + ","+ ban + ","+ no + ","+kor + ","+eng + ","+math+","+sum+","+avg;
	}


	}
	
	




