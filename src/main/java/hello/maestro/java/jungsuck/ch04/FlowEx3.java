class FlowEx3 
{ 
      public static void main(String[] args) 
      { 
            int score = 45; 
            char grade =' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

            if (score >= 90) {          // score가 90점 보다 같거나 크면 A학점
                   grade = 'A';             
            } else if (score >=80) {   // score가 80점 보다 같거나 크면 B학점 
                   grade = 'B'; 
            } else {                     // 나머지는 C학점
                   grade = 'C'; 
            }
            
            System.out.println("당신의 학점은 " + grade + "입니다."); 
      } 
} 