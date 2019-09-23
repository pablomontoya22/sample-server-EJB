package utilities;

import java.util.List;

public interface BasicRemote {
	public List<Object> list();
	public int save(Object o);
	public Object find(Long id);
}
