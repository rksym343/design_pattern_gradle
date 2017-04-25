package design_pattern.observer.before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores;
	private DataSheetView dataSheetView;

	public ScoreRecord() {
		scores = new ArrayList<>();
	}

	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}

	public void addScore(int score) {
		scores.add(score);
		dataSheetView.update();
	}

	public List<Integer> getScores() {
		return scores;
	}

}
