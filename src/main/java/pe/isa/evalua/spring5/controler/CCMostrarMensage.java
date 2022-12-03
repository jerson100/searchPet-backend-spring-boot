package pe.isa.evalua.spring5.controler;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.isa.evalua.spring5.entity.CEConstant;

@Controller
public class CCMostrarMensage {
	public static final Logger LOG = LoggerFactory.getLogger("CCMostrarMensage");
	
	@RequestMapping(value="/showMessage.ea")
	public ModelAndView linkedHashSetRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_VIEW_MESSAGE);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("message", "Declarando un Mapa para visualiza en el DOM");

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_VIEW_MESSAGE, "vModel", myModel);
	}
}
