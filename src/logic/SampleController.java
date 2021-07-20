package logic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {

    @FXML
    private Label result;

    Integer firstNumber;
    Integer secondNumber;
    Operation currentOperation;
    
    private void pressNumber(int n) {
    	result.setText(String.valueOf(n));
    	if(currentOperation == null) {
    		firstNumber = n;
    	}else {
    		secondNumber = n;
    	}
    }
    
    @FXML
    void btn0(ActionEvent event) {
    	pressNumber(0);
    }

    @FXML
    void btn1(ActionEvent event) {
    	pressNumber(1);
    }

    @FXML
    void btn2(ActionEvent event) {
    	pressNumber(2);
    }

    @FXML
    void btn3(ActionEvent event) {
    	pressNumber(3);
    }

    @FXML
    void btn4(ActionEvent event) {
    	pressNumber(4);
    }

    @FXML
    void btn5(ActionEvent event) {
    	pressNumber(5);
    }

    @FXML
    void btn6(ActionEvent event) {
    	pressNumber(6);
    }

    @FXML
    void btn7(ActionEvent event) {
    	pressNumber(7);
    }

    @FXML
    void btn8(ActionEvent event) {
    	pressNumber(8);
    }

    @FXML
    void btn9(ActionEvent event) {
    	pressNumber(9);
    }

    @FXML
    void btnDivide(ActionEvent event) {
    	currentOperation = Operation.DIVIDE;
    }

    @FXML
    void btnEquals(ActionEvent event) {
    	int r = 0;
    	switch(currentOperation) {
    		case PLUS:
	    		r = firstNumber + secondNumber;
	    		break;
    		case MINUS:
	    		r = firstNumber - secondNumber;
	    		break;
    		case PRODUCT:
	    		r = firstNumber * secondNumber;
	    		break;
    		case DIVIDE:
	    		r = firstNumber / secondNumber;
	    		break;
    	}
    	result.setText(String.valueOf(r));
    	firstNumber = r;
    	secondNumber = 0;
    	currentOperation = null;
    }

    @FXML
    void btnMinus(ActionEvent event) {
    	currentOperation = Operation.MINUS;
    }

    @FXML
    void btnPlus(ActionEvent event) {
    	currentOperation = Operation.PLUS;
    }

    @FXML
    void btnProduct(ActionEvent event) {
    	currentOperation = Operation.PRODUCT;
    }
    
    @FXML
    void btnCancel(ActionEvent event) {
    	result.setText(String.valueOf(0));
    	firstNumber = 0;
    	secondNumber = 0;
    	currentOperation = null;
    }
}

