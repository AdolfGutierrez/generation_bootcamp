package appmockito.repositories;

import java.util.Collections;
import java.util.List;

import appmockito.model.Examen;

public class ExamenRepositoryImp implements ExamenRepository {

	@Override
	public List<Examen> findAll() {
		
		return Collections.emptyList();
		/*Arrays.asList(new Examen(1L, "Historia"),
		new Examen(2L,"Matematicas"),
		new Examen(3L,"IA"),
		new Examen(4L, "Programacion")
		
		);*/
	}

}
