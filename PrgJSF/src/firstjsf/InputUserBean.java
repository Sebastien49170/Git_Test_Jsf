package firstjsf;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class InputUserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String surname;


	public InputUserBean(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public InputUserBean() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
