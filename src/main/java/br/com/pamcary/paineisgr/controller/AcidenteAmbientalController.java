package br.com.pamcary.paineisgr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pamcary.paineisgr.service.AcidenteAmbientalService;


@Controller
@RequestMapping(value = "/ambiental")
public class AcidenteAmbientalController {
	
	@Autowired
	AcidenteAmbientalService oAmbiental;
	
	@RequestMapping(value = "/indicadores")
	public ModelAndView getIndicadores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("indicador",oAmbiental.getIndicador());
		oModel.setViewName("acidentes_ambientais_indicador");
		return oModel;
	}

	@RequestMapping(value = "/valores")
	public ModelAndView getValores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("valor",oAmbiental.getValor());
		oModel.setViewName("acidentes_ambientais_valor");
		return oModel;
	}
}
