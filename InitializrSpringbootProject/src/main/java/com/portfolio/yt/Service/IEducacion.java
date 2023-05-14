
package com.portfolio.yt.Service;

import com.portfolio.yt.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IEducacion extends JpaRepository<Educacion, Integer>{
    
}
