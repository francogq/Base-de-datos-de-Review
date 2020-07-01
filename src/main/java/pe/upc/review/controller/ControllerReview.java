package pe.upc.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import pe.upc.review.entidad.Review;
import pe.upc.review.servicio.ServicioReview;

@RestController
@RequestMapping("/api")
public class ControllerReview {
	
	@Autowired
	private ServicioReview servicioReview;
	
	
	@GetMapping("/ListadoReview")
	public List<Review> listadoReview(){
		List<Review> r = null;
		try {
			r=servicioReview.obtenerReview();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No se encontraron review");
		}
		return r;
	}

}
