package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.LinkedHashMap;
import java.util.Map;
import models.Productos;
import models.ValidarProducto;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author jdavi
 */
@Controller
@RequestMapping("formulario.htm")
public class FormularioController {

    private final ValidarProducto validarProducto;

    public FormularioController() {
        this.validarProducto = new ValidarProducto();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("formulario");
        mav.addObject("productos", new Productos());
        return mav;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(
            @ModelAttribute("productos") Productos p,
            BindingResult result,
            SessionStatus status
    ) {
        this.validarProducto.validate(p, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("formulario");
            mav.addObject("productos", new Productos());
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("factura");
            mav.addObject("nombre", p.getNombre());
            mav.addObject("tipoIdentificacion", p.getTipoIdentificacion());
            mav.addObject("numeroIdentificacion", p.getNumeroIdentificacion());
            mav.addObject("cantidadCamisas", p.getCantidadCamisas());
            mav.addObject("cantidadChaquetas", p.getCantidadChaquetas());
            mav.addObject("cantidadPantalones", p.getCantidadPantalones());
            return mav;
        }
    }
    
//    @ModelAttribute("listaProductos")
//    public Map<String, String> listaProductos() {
//        Map<String, String> listaProducto = new LinkedHashMap<>();
//        listaProducto.put("1", "Camisa formal");
//        listaProducto.put("2", "Pantalón formal");
//        listaProducto.put("3", "Chaqueta");
//        return listaProducto;
//    }

    @ModelAttribute("listaTipoIdentificacion")
    public Map<String, String> listaTipoIdentificacion() {
        Map<String, String> listaTipoIdentificacion = new LinkedHashMap<>();
        listaTipoIdentificacion.put("1", "Cédula de ciudadanía");
        listaTipoIdentificacion.put("2", "Cédula de extranjería");
        listaTipoIdentificacion.put("3", "Tarjeta de identidad");
        listaTipoIdentificacion.put("4", "Tarjeta pasaporte");
        listaTipoIdentificacion.put("5", "Registro civil");
        return listaTipoIdentificacion;
    }
}
