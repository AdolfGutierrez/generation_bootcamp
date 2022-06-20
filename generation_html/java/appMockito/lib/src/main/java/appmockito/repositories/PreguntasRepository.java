package appmockito.repositories;

import java.util.List;

public interface PreguntasRepository {
	List<String>findPreguntasPorExamenId(Long id);
}
