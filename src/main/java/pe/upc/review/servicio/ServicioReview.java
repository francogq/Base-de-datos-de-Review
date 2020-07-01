package pe.upc.review.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upc.review.entidad.Review;
import pe.upc.review.repositorio.RepositorioReview;

@Service
public class ServicioReview {
	@Autowired
	private RepositorioReview repositorioReview;
	
	
	
	public List<Review> obtenerReview(){
		return repositorioReview.findAll();
	}

}
