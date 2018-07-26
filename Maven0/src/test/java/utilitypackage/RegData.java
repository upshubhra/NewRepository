package utilitypackage;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name="registrationData")
public class RegData {
	private List<Data> regdata;
	
	@javax.xml.bind.annotation.XmlElement(name ="data")
	public void setUserData(List<Data> regdata) {
		this.regdata =regdata;
	}
	public List<Data> getUserData() {
		return regdata;
	}
}
