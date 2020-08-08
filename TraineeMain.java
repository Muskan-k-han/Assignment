import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TraineeMain {
	HashMap<Integer, Trainee> map1 = new HashMap<Integer, Trainee>();

	public static void main(String args[]) {
		Trainee t1 = new Trainee(01, "Raj");
		Trainee t2 = new Trainee(02, "Kamal");
		Trainee t3 = new Trainee(03, "Rohan");
		Trainee t4 = new Trainee(04, "Rohit");
		Trainee t5 = new Trainee(05, "Mitali");

		for (Integer k : keys) {
			Trainee t = map.get(k);
			if (t instanceof EceTrainee) {
				Set<Trainee> ecet = new HashSet<>();
				ecet.add(t);
			}
			if (t instanceof CsTrainee) {

				Set<Trainee> cset = new HashSet<>();
				cs.add(t);
			}
		}
		display();
	}

	public void display();

	{
		for (Trainee t : ecet) {
			EceTrainee t1 = (EceTrainee) t;

			System.out.println("id=" + t1.getId() + "name" + t1.getname() + "device=" + t1.getDeviceus());
		}

		for (Trainee t : cst) {
			CsTrainee c1 = (CsTrainee) t;
			System.out.println("id=" + c1.getId() + "name" + c1.getname() + "device=" + c1.getNumoflang());

		}
	}

}
