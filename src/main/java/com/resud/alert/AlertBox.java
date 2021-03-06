package com.resud.alert;

import javafx.scene.control.Alert;
/**
 * Created by RRM on 08.04.17.
 */
public class AlertBox {

    private static Alert alertInfo = new Alert(Alert.AlertType.INFORMATION);
    private static Alert alertWarning = new Alert(Alert.AlertType.WARNING);

    public static void Info(String sTitle, String txtHeader, String txtContent){

        alertInfo.setTitle(sTitle);
        alertInfo.setHeaderText(txtHeader);
        alertInfo.showAndWait();
    }

    public static void Warning(String sTitle, String txtHeader, String txtContent){
        alertWarning.setTitle(sTitle);
        alertWarning.setHeaderText(txtHeader);
        alertWarning.setContentText(txtContent);
        alertWarning.showAndWait();
    }

}
