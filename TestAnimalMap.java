import java.util.HashMap;
import java.util.Scanner;

public class TestAnimalMap {

	public static void main(String[] args) {
		
		HashMap<String , String> animalsMap = new HashMap<String , String>();
		animalsMap.put("狗","Dog");
		animalsMap.put("貓","Cat");
		animalsMap.put("鳥","Brid");	
		

		CheckMap(animalsMap);
		AnimalsMapCheck(animalsMap);
	}

	private static void CheckMap(HashMap<String, String> Map) {
		for (String key : Map.keySet()) 
		       System.out.println("key= "+ key + " and value= " + Map.get(key));
	}

	private static void AnimalsMapCheck(HashMap<String, String> animalsmap) {
		while(true){
			Scanner enterkey = new Scanner(System.in);
			System.out.println("輸入想查詢的文字 Enter keyword to check");
			String keyword = enterkey.nextLine();
			if(keyword.equals("End")) break;
			String result = animalsmap.get(keyword);
			if(result == null) System.out.println("查不到資料");
			if(result != null) System.out.println("查詢成功" + result);
		}
	}
}
