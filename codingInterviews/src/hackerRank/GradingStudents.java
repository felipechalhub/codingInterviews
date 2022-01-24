package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		List <Integer> grades = new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
			
		System.out.println(gradingStudents(grades));
	}
    public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < grades.size(); i++) {
			if(grades.get(i) < 38) {
				ans.add(grades.get(i));				
			}else {
				int multiple = (grades.get(i)/5) + 1;
				int mulOf5 = multiple*5;
				int diff = mulOf5-grades.get(i);
				if(diff<3)
					ans.add(mulOf5);
				else
					ans.add(grades.get(i));
			}
		}
		return ans ;

    }

}
