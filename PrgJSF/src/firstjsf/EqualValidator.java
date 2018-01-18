package firstjsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "equalValidator")
public class EqualValidator implements Validator{

	private static final String CHAMP2 = " Name and surname range must be differents";
	private static final String ATTRIBUTE = "nameAttribute";

	@Override
	public void validate(FacesContext arg0, UIComponent component, Object value) throws ValidatorException {
		UIInput component1 = (UIInput) component.getAttributes().get(ATTRIBUTE);
		String surname = value.toString();
		String name = component1.getValue().toString();

		if(surname.equals(name)) {
			FacesMessage errMsg = new FacesMessage(CHAMP2);
			throw new ValidatorException(errMsg);				
		}
	}
}
