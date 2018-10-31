package hr.did.helpdesk.controller;

import java.security.Principal;
import java.util.Calendar;
import java.util.Date;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import hr.did.helpdesk.model.Hitnost;
import hr.did.helpdesk.model.Kategorija;
import hr.did.helpdesk.model.PrijavaKvaraForm;
import hr.did.helpdesk.model.PrijavaKvarova;
import hr.did.helpdesk.model.Zaposlenik;

import hr.did.helpdesk.helper.HitnostEditor;
import hr.did.helpdesk.helper.KategorijaEditor;
//import hr.did.helpdesk.model.PrijavaKvarova;
import hr.did.helpdesk.helper.MockHelper;
import hr.did.helpdesk.helper.ZaposlenikEditor;

@Controller
@SessionAttributes({"prijavaKvaraForm"})
public class PrijavaKvaraController {
	
	@InitBinder
	public void dataBinding(WebDataBinder binder){
		binder.registerCustomEditor(Zaposlenik.class, new ZaposlenikEditor());
		binder.registerCustomEditor(Hitnost.class, new HitnostEditor());
		binder.registerCustomEditor(Kategorija.class, new KategorijaEditor());
	}
	
	@ModelAttribute("prijavaKvaraForm")
	public PrijavaKvaraForm getPrijavaKvaraForm(){
		return new PrijavaKvaraForm() ;
	}	
	
	
	@GetMapping("/novaPrijava")
//	@GetMapping
	public String showForm(Model model){
		model.addAttribute("zaposlenici", MockHelper.mockZaposlenikList());
		model.addAttribute("kategorije", MockHelper.mockKategorijaList());
		model.addAttribute("hitnosti", MockHelper.mockHitnostList());

		return "novaPrijava";
	}
	@RequestMapping("/novaPrijava")
//	@PostMapping("/novaPrijava")
//	@PostMapping
	public String processForm(@ModelAttribute PrijavaKvaraForm prijavaKvaraForm, Model model, Principal principal){
		if (prijavaKvaraForm.getZaposlenik()==null){
			for (Zaposlenik zaposlenik : MockHelper.mockZaposlenikList()) {
				if(zaposlenik.getUsername().equals(principal.getName())){
					prijavaKvaraForm.setZaposlenik(zaposlenik);
				break;
				}
			}
			
		}		
		
		Integer id=1;
		
		Date datetrenutni = new Date();
			
		Integer godina = Calendar.getInstance().get(Calendar.YEAR);
		
		Integer status=1;
		
		Integer promjena=1;
		
		PrijavaKvarova prijava = new PrijavaKvarova(id, prijavaKvaraForm.getNazivPrijave(),prijavaKvaraForm.getOpisPrijave(),prijavaKvaraForm.getKategorija(),
				datetrenutni, godina, prijavaKvaraForm.getHitnost(), prijavaKvaraForm.getZaposlenik(), prijavaKvaraForm.getZaposlenik(), status, promjena);
				
		model.addAttribute("prijavaKvarova", prijava);
		
		return "potvrda";		
	}
	@RequestMapping("/spremiNovuPrijavu")
	public String spremiNovuPrijavu(@SessionAttribute PrijavaKvaraForm prijavaKvaraForm, Model model, Principal principal){	  
		if (prijavaKvaraForm.getZaposlenik()==null){
			for (Zaposlenik zaposlenik : MockHelper.mockZaposlenikList()) {
				if(zaposlenik.getUsername().equals(principal.getName())){
					prijavaKvaraForm.setZaposlenik(zaposlenik);
				break;
				}
			}
			
		}
		
		Integer id=1;
		
		Date datetrenutni = new Date();
			
		Integer godina = Calendar.getInstance().get(Calendar.YEAR);
		
		Integer status=1;
		
		Integer promjena=1;
		
		PrijavaKvarova prijava = new PrijavaKvarova(id, prijavaKvaraForm.getNazivPrijave(),prijavaKvaraForm.getOpisPrijave(),prijavaKvaraForm.getKategorija(),
				datetrenutni, godina, prijavaKvaraForm.getHitnost(), prijavaKvaraForm.getZaposlenik(), prijavaKvaraForm.getZaposlenik(), status, promjena);
		
		model.addAttribute("prijavaKvarova", prijava);
		return "prijava";
	}
	@RequestMapping("/novaPrijavaFresh")
	public String novaPrijavaFresh(Model model, SessionStatus status){
	
		//resetiranje sesijskih varijabli
		status.setComplete();
		
		model.addAttribute("prijavaKvaraForm", new PrijavaKvaraForm());
		
		return "redirect:/novaPrijava";
	}
}
