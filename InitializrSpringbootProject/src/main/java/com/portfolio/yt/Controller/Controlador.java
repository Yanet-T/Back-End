
package com.portfolio.yt.Controller;

import com.portfolio.yt.Entity.Educacion;
import com.portfolio.yt.Service.IEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yanet
 */
@RestController
@RequestMapping("/educacion")
public class Controlador {
    @Autowired
    private IEducacion repositorio;
    
    @GetMapping
    public List<Educacion> getEducacion(){
        return repositorio.findAll();
    }
    
    @PostMapping
  public Object agregarEducacion(@RequestBody Educacion e){
      return repositorio.save(e);
  }
  
  @DeleteMapping(value = "/{id}")
  public void eliminarEducacion(@PathVariable int id){
      repositorio.deleteById(id);
  }
  
  @GetMapping(value = "/{id}")
    public Object getProducto(@PathVariable int id){
        return repositorio.findById(id);
    }
    
  @PutMapping
  public void actualizarEducacion(@RequestBody Educacion e){
      repositorio.saveAndFlush(e);
  }
}


