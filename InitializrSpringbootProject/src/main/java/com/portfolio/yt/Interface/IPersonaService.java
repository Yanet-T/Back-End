
package com.portfolio.yt.Interface;

import com.portfolio.yt.Entity.Persona;
import java.util.List;

/**
 *
 * @author yanet
 */
public interface IPersonaService {
    public List<Persona> getPersona();
    
    
    public void savePersona (Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
}
