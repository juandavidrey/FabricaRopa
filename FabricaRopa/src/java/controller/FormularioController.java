package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jdavi
 */
@Controller

public class FormularioController {

    @RequestMapping("formulario.htm") 
    public ModelAndView formulario()
    {
        ModelAndView form = new ModelAndView();
        form.setViewName("formulario");
        return form;
    }
}
