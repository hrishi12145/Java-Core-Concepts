package StringQuestions;
// String Mutable using StringBuilder and StringBuffer
// StringBuilder is More efficient for larger calculation  than StringBuffer
public class StringMutableEx {
	public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
		StringBuilder strbuilder = new StringBuilder("Java");
		for (int i = 1; i < 100000; i++) {
			strbuilder.append(" Programming");
		}
		
        System.out.println("StringBuilder: "+(System.currentTimeMillis()-startTime) + "ms");
        
        startTime = System.currentTimeMillis();
		StringBuffer strbuffer = new StringBuffer("Java");
		for (int i = 1; i < 100000; i++) {
			strbuffer.append(" Programming");
		}
		System.out.println("StringBuffer: "+(System.currentTimeMillis()-startTime )+ "ms");
	}
}
