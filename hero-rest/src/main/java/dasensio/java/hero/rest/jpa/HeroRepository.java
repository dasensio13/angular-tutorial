package dasensio.java.hero.rest.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dasensio.java.hero.rest.model.Hero;

@Repository("heroRepository")
public interface HeroRepository extends JpaRepository<Hero, Long> {

	List<Hero> findByName(@Param(value = "name") String name);

	List<Hero> findByNameContainingIgnoreCase(@Param(value = "name") String name);
}
