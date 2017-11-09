package work2;

public interface Pupil {
	void dannie(String name,String nick, String phone);

}

public class Spisok implements Pupil {

	public static void main(String[] args) {

		Spisok s = new Spisok();
		s.dannie("Артур", "Rumart", "762598628");
		s.dannie("Максим", "Maks", "2924670");
		s.dannie("Петя", "Pit", "4213745");
		s.dannie("Вася", "Viskis", "64024786");
		s.dannie("Света", "lampochka", "132578");
	}

	@Override
	public void dannie(String name, String nick, String phone) {
		System.out.println(name + " " + nick + " " + phone);

	}
}
