package middle.ex1.today;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		if(result<0) {System.out.println("더 작습니다.");}
		else if(result > 0) {System.out.println("더 큽니다.");}
		else {System.out.println("같습니다");}
		
		
		
		result = Objects.compare(s1, s3, new StudentComparator());
		if(result<0) {System.out.println("더 작습니다.");}
		else if(result > 0) {System.out.println("더 큽니다.");}
		else {System.out.println("같습니다");}
		
		
		
		result = Objects.compare(s2, s3, new StudentComparator());
		if(result<0) {System.out.println("더 작습니다.");}
		else if(result > 0) {System.out.println("더 큽니다.");}
		else {System.out.println("같습니다");}
		
		
		
		result = Objects.compare(s3, s2, new StudentComparator());
		if(result<0) {System.out.println("더 작습니다.");}
		else if(result > 0) {System.out.println("더 큽니다.");}
		else {System.out.println("같습니다");}
	}
		static class Student{
			int sno;
			Student(int sno){
				this.sno = sno;
			}
		}
		
		static class StudentComparator implements Comparator<Student>{
			@Override
			public int compare(Student o1,Student o2) {
				return Integer.compare(o1.sno, o2.sno);
			}
		}
	}


