package memoria;

public class OutOfMemoryError {
	public static void main(String[] args) {
		int ArraySize=16*256000*1024;
        int[] i = new int[ArraySize];
        System.out.println(i);
	}
}
