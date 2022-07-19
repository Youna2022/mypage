package ch03;

public class If5 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";

		
		if(score >= 90) { grade = "A";
		}
		if(score > 97) { grade = grade +"+";
		}else if(score < 94) { grade += "-";
		}
		
		else if(score >= 80) { grade = "B";
		}
		if(score > 87) { grade = "B+";
		}else if(score < 84) { grade += "-";
		}
		
		else if(score >= 70) { grade = "C";
		}
		if(score > 77) { grade = "+";
		}else if(score < 74) { grade += "-";
		
	
		
		}
	System.out.println("당신점수는"+score+" 이고" + "학점은 " +grade+"입니다");
		
}
	
}

package ch03;

public class If4 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";

		if (score >= 90) {
			grade = "A";
			if (score > 97) {
				grade += "+";
			} else if (score < 94) {
				grade += "-";
			}
		} else if (80 <= score && score < 90) {
			grade = "B";
			if (score > 87) {
				grade += "+";
			} else if (score < 84) {
				grade += "-";
			}

		} else if (70 < score) {
			grade = "C";
			if (score > 77) {
				grade += "+";
			} else if (score < 74) {
				grade += "-";
			}
		} else {
			grade = "F";}

		System.out.println("당신점수는" + score + " 이고" + "학점은 " + grade + "입니다");
	}
}
