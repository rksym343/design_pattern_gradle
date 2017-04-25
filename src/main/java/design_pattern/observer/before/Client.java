package design_pattern.observer.before;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		scoreRecord.setDataSheetView(dataSheetView);

		for (int i = 1; i < 6; i++) {
			scoreRecord.addScore(i * 10);
		}
		scoreRecord.addScore(200);
	}
}
