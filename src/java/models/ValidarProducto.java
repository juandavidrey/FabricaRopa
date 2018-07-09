package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ValidarProducto implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Productos.class.isAssignableFrom(type);
        // return TuClase.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        Productos producto = (Productos) obj;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre",
                "required.nombre", "El campo nombre es obligatorio.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numeroIdentificacion",
                "required.nombre", "El campo numero de identificación es obligatorio.");
        
        if (producto.getTipoIdentificacion().isEmpty()) {
            errors.rejectValue("tipoIdentificacion", "required.tipoIdentificacion", "Seleccione un tipo de identificacion");
        }
        
        int cantidad = producto.getCantidadCamisas() + producto.getCantidadChaquetas()
                + producto.getCantidadPantalones();
        
        if(cantidad>5){
            errors.reject("No puede pedir más de 5 productos en un solo pedido");
        }else{
            if (cantidad==0) {
                errors.reject("Seleccione al menos un producto para comprar");
            }
        }

    }

}
