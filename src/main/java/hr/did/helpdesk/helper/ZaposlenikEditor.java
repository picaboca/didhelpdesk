package hr.did.helpdesk.helper;

import java.beans.PropertyEditorSupport;

import hr.did.helpdesk.model.Zaposlenik;


public class ZaposlenikEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) {
			Zaposlenik z=null;
		
		for (Zaposlenik zaposlenik: MockHelper.mockZaposlenikList()){
			if(zaposlenik.getId().equals(Integer.parseInt(text))){
				z=zaposlenik;
				break;
			}
		}
		this.setValue(z);
	}

	@Override
	public String getAsText() throws IllegalArgumentException {
		Zaposlenik z=(Zaposlenik) this.getValue();
		return (z !=null ? z.getId().toString() :"");
	}	
}
	

