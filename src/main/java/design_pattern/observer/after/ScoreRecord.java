package design_pattern.observer.after;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	private List<Integer> scores;

	public ScoreRecord() {
		scores = new ArrayList<>();
	}

	public void addScore(int score) {
		scores.add(score);
		notifyObserver();
	}

	public List<Integer> getScores() {
		return scores;
	}

}
