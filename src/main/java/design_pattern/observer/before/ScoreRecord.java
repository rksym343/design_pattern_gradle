package design_pattern.observer.before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores;
	private List<DataSheetView> dataSheetViews;
	// private DataSheetView dataSheetView;
	private MinMaxView minMaxView;

	public ScoreRecord() {
		scores = new ArrayList<>();
		dataSheetViews = new ArrayList<>();
	}

	public MinMaxView getMinMaxView() {
		return minMaxView;
	}

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}

	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView);
	}

	/*
	 * public void setDataSheetView(DataSheetView dataSheetView) {
	 * this.dataSheetView = dataSheetView; }
	 */

	public void addScore(int score) {
		scores.add(score);
		// dataSheetView.update();
		for(DataSheetView dataSheetView : dataSheetViews){
			dataSheetView.update();
		}
		minMaxView.update();
	}

	public List<Integer> getScores() {
		return scores;
	}

}
