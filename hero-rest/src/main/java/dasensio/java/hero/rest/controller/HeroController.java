package dasensio.java.hero.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dasensio.java.hero.rest.model.Hero;
import dasensio.java.hero.rest.service.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {

	@Autowired
	HeroService heroService;

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Hero getHero(@PathVariable final Long id) {
		return heroService.getHero(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Hero> getHeroes() {
		return heroService.getHeroes();
	}
}
