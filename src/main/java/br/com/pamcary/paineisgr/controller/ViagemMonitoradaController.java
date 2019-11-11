package br.com.pamcary.paineisgr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pamcary.paineisgr.service.ViagemMonitoradaService;


@Controller
@RequestMapping(value = "/monitoradas")
public class ViagemMonitoradaController {
	
	@Autowired
	ViagemMonitoradaService oMonitorada;
	
	@RequestMapping(value = "/indicadores")
	public ModelAndView getIndicadores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("indicador",oMonitorada.getIndicador());
		oModel.setViewName("viagens_monitoradas_indicador");
		System.out.println("Passando pelo controller");
		
		return oModel;
	}

	@RequestMapping(value = "/valores")
	public ModelAndView getValores() {
		
		ModelAndView oModel = new ModelAndView();
		oModel.addObject("valor",oMonitorada.getValor());
		oModel.setViewName("viagens_monitoradas_valor");
		return oModel;
	}
}
