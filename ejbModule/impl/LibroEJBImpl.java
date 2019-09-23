package impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Libro;
import interfaces.LibroRemote;

@Stateless(name="Libros")
public class LibroEJBImpl<T> implements LibroRemote {

	@PersistenceContext(unitName="PruebaEJB")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	private Class<T> cls = (Class<T>) Libro.class;

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> list() {
		Query q = em.createQuery(
				String.format("select c from %s c",
						cls.getSimpleName()));
		return q.getResultList();
	}

	@Override
	public int save(Object o) {
		em.persist(o);
		return 0;
	}

	@Override
	public Object find(Long id) {
		Object result = em.find(cls, id);
		if (result==null) {
			throw new RuntimeException(
					String.format("%s id = %d, no encontrado",
							cls.getSimpleName(), id));
		}
		return result;
	}

}
