
package firstjsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "surnameValidator")
public class SurnameValidator implements Validator{

	private static final String CHAMP = " This range must have at least 2 characters";

	@Override
	public void validate(FacesContext arg0, UIComponent component, Object value) throws ValidatorException {
		String name = value.toString();
		if(name.length() < 2) {
			FacesMessage errMsg = new FacesMessage(CHAMP);
			throw new ValidatorException(errMsg);				
		}
	}
}