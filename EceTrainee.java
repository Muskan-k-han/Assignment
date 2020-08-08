package schoolapp.src.main.java;
public class EceTrainee {
	public EceTrainee(int id, String name) {
		super(id, name);

	}
}

public class EceTrainee extends Trainee {
	int languages;

	public int getLanguages() {
		return languages;
	}

	public void setLanguages(int languages) {
		this.languages = languages;
	}

}
