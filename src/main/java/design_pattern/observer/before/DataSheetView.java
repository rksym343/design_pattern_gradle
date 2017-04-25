package design_pattern.observer.before;

import java.util.List;

public class DataSheetView {

	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		super();
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() {
		List<Integer> records = scoreRecord.getScores();
		displayScores(records, viewCount);
	}

	private void displayScores(List<Integer> records, int viewCount) {
		System.out.println("List of " + viewCount + " entries : ");
		for (int i = 0; i < viewCount && i < records.size(); i++) {
			System.out.println(records.get(i) + " ");
		}
		System.out.println();
	}

}
