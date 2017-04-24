package dasensio.java.hero.rest.service;

import java.io.Serializable;
import java.util.List;

import dasensio.java.hero.rest.model.Hero;

public interface HeroService extends Serializable {

	public Hero getHero(Long id);

	public List<Hero> getHeroes();

	public void deleteHeroe(Hero hero);

	public void deleteHeroe(Long id);

	public Hero updateHero(Hero hero);

	public Hero insertHero(Hero hero);
}
