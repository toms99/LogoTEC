package TEC.Proyecto_LogoTEC;

import org.antlr.v4.runtime.*;

import javafx.scene.control.TextArea;

import java.util.*;

public class ErrorManager extends BaseErrorListener {
	List<String> alertMess = new ArrayList<String>() ;
	TextArea warningArea;
	
	
	public ErrorManager(TextArea warningArea) {
		super();
		this.warningArea = warningArea;
	}

	@Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        alertMess.add("Alerta en regla: "+ stack + " line "+line+":"+charPositionInLine + ": "+msg);
        warningArea.setText(alertMess.toString());
    }
	
	public List<String> getAlertMess(){
		return this.alertMess;
	}
}
