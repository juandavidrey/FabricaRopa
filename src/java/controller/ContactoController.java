/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author jdavi
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactoController {
    
    @RequestMapping("contacto.htm")
    public ModelAndView home()
    {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("contacto");
        return mav;
    }
    
}
