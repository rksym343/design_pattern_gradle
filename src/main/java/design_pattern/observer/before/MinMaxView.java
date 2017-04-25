package design_pattern.observer.before;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxView {

	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		super();
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		List<Integer> records = scoreRecord.getScores();
		displayMinMax(records);
	}

	private void displayMinMax(List<Integer> records) {
		int min = Collections.min(records);
		int max = Collections.max(records);
		System.out.printf("Min : %d, Max : %d %n", min, max);
	}

}
