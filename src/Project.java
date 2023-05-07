import java.util.*;

public class Project {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> message = new HashMap<String, String>();
		
		message.put("apple","사과"); message.put("human", "인간"); message.put("falut", "오류"); message.put("emotion", "감정"); 
		message.put("painting", "그림"); message.put("love", "사랑"); message.put("eye","눈"); message.put("happy", "행복한");
		message.put("funny", "재미있는"); message.put("fast", "빠른"); message.put("slow", "느린"); message.put("big", "큰"); 
		message.put("pretty", "예쁜"); message.put("brave", "용감한"); message.put("kind", "친절한"); //단어 설정
		
		while(true) {
			System.out.println("**** 영어 단어 테스트 프로그램 '명품영어 입니다. ****");
			System.out.print("단어 테스트:1, 단어 삽입:2. 종료:3>>");
			
			int x = scanner.nextInt();
			if (x == 1) {
				System.out.println("현재 " + message.size() +"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
				while (true) {
					List<String> keyList = new ArrayList<>(message.keySet());
	                String randomKey = keyList.get(random.nextInt(keyList.size()));
	                String answer = message.get(randomKey);

	                List<String> options = new ArrayList<>(message.values());
	                Collections.shuffle(options);
	                options = options.subList(0, 3);
	                options.add(answer);
	                Collections.shuffle(options);

	                System.out.println(randomKey + "?");
	                for (int i = 0; i < 4; i++) {
	                    System.out.print(i+1 + "."+options.get(i) + " ");
	                }
	                System.out.print(":>");
	                int input = scanner.nextInt();
	                if (input == -1) {
	                    break;
	                }
	                if (options.get(input-1).equals(answer)) {
	                   System.out.println("Excellent !!");
	                } else {
	                    System.out.println("No. !!");
	                }
				}
			} else if (x == 2) {
				while(true) {
					 System.out.print("영어 한글 입력>> ");
					 scanner.nextLine(); // 버퍼에 남아있는 개행문자 제거
					 String input = scanner.nextLine();
					 String[] words = input.split(" ");
					 if (words[0].equals("그만")) {
						 break;
					 } else if (words.length != 2) {
						 System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
						 continue;
					 } else {
						 message.put(words[0], words[1]);
						 System.out.println("입력되었습니다.");
						 continue;
					 }
				}
			} else if (x == 3) {
				System.out.println("명품영어를 종료합니다.");
				break;
			} else {
				System.out.println("정확히 입력해주세요.");
			}
		}
	}
}
