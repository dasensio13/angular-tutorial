package dasensio.java.hero.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dasensio.java.hero.rest.jpa.HeroRepository;
import dasensio.java.hero.rest.model.Hero;

@Service("heroService")
public class HeroServiceImpl implements HeroService {

	private static final long serialVersionUID = -4569420219734611633L;

	@Autowired
	HeroRepository heroRepository;

	@Override
	public Hero getHero(final Long id) {
		return heroRepository.findOne(id);
	}

	@Override
	public List<Hero> getHeroes() {
		return heroRepository.findAll();
	}

	@Override
	public void deleteHeroe(final Hero hero) {
		heroRepository.delete(hero);
	}

	@Override
	public void deleteHeroe(final Long id) {
		heroRepository.delete(id);
	}

	@Override
	public Hero updateHero(final Hero hero) {
		return heroRepository.save(hero);
	}

	@Override
	public Hero insertHero(final Hero hero) {
		return heroRepository.save(hero);
	}

	@Override
	public List<Hero> searchHeroes(final String name) {
		return heroRepository.findByNameContainingIgnoreCase(name);
	}

}
