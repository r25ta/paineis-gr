package br.com.pamcary.paineisgr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pamcary.paineisgr.service.AcidenteAmbientalService;
import br.com.pamcary.paineisgr.service.ForteSuspeitaService;
import br.com.pamcary.paineisgr.service.ViagemMDFeService;
import br.com.pamcary.paineisgr.service.ViagemMonitoradaService;


@Controller
@RequestMapping(value = "/suspeita")
public class ForteSuspeitaController {
	
	@Autowired
	ForteSuspeitaService oSuspeita;
	
	@RequestMapping(value = "/indicadores")
	public ModelAndView getIndicadores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("indicador",oSuspeita.getIndicador());
		oModel.setViewName("fortes_supeitas_indicador");
		return oModel;
	}

	@RequestMapping(value = "/valores")
	public ModelAndView getValores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("valor",oSuspeita.getValor());
		oModel.setViewName("fortes_supeitas_valor");
		return oModel;
	}
}
