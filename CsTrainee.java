package schoolapp.src.main.java;
public class CsTrainee {
	public CsTrainee(int id, String name) {
		super(id, name);

	}
}

public class CsTrainee extends Trainee {
	int languages;

	public int getLanguages() {
		return languages;
	}

	public void setLanguages(int languages) {
		this.languages = languages;
	}

}
