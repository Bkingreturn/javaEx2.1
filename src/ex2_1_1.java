import java.lang.String;

class speach{
	float weight,height;
	String words;
	String words() {
		return "You are a good student.";
	}
	String word() {
		return "Speacial.";
	}
}

class talk extends speach{
	String words() {
		return "Are you crazy?";
	}
}

public class ex2_1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	talk chat;
	chat=new talk();
	String a=chat.words();
	String b=chat.word();
	System.out.println(a);
	System.out.println(b);
	}
}
