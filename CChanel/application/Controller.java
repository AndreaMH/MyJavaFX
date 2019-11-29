package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private void handleClose() {
		System.exit(0);
	}

	public void showSendProfile() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/vista2.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			loader.setController(new SetBlur());
			sendStage.setTitle("Vista2");

			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class SetBlur {

		@FXML
		private ImageView octoCat;

		@FXML
		public void initialize() {
			octoCat.setEffect(new GaussianBlur(50));

		}
	}

	@FXML
	private void handleSend() {
		showSendProfile();
	}
}
