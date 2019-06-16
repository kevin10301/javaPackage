import java.util.HashMap;
import java.util.Scanner;

public class TestAnimalMap {

	public static void main(String[] args) {
		
		HashMap<String , String> animalsMap = new HashMap<String , String>();
		animalsMap.put("��","Dog");
		animalsMap.put("��","Cat");
		animalsMap.put("��","Brid");	
		

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
			System.out.println("��J�Q�d�ߪ���r Enter keyword to check");
			String keyword = enterkey.nextLine();
			if(keyword.equals("End")) break;
			String result = animalsmap.get(keyword);
			if(result == null) System.out.println("�d������");
			if(result != null) System.out.println("�d�ߦ��\" + result);
		}
	}
}
