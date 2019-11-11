package br.com.pamcary.paineisgr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pamcary.paineisgr.service.AcidenteAmbientalService;
import br.com.pamcary.paineisgr.service.RouboService;
import br.com.pamcary.paineisgr.service.ViagemMDFeService;
import br.com.pamcary.paineisgr.service.ViagemMonitoradaService;


@Controller
@RequestMapping(value = "/roubo")
public class RouboController {
	
	@Autowired
	RouboService oRoubo;
	
	@RequestMapping(value = "/indicadores")
	public ModelAndView getIndicadores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("indicador",oRoubo.getIndicador());
		oModel.setViewName("roubos_indicador");
		return oModel;
	}

	@RequestMapping(value = "/valores")
	public ModelAndView getValores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("valor",oRoubo.getValor());
		oModel.setViewName("roubos_valor");
		return oModel;
	}
}
