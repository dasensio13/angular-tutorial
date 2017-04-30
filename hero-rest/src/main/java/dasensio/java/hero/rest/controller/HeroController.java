package dasensio.java.hero.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dasensio.java.hero.rest.model.Hero;
import dasensio.java.hero.rest.service.HeroService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hero")
public class HeroController {

	@Autowired
	HeroService heroService;

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public Hero getHero(@PathVariable final Long id) {
		return heroService.getHero(id);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@CrossOrigin(origins = "*")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteHero(@PathVariable final Long id) {
		heroService.deleteHeroe(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Hero> getHeroes() {
		return heroService.getHeroes();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Hero createHero(@RequestBody final Hero hero) {
		return heroService.insertHero(hero);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public Hero updateHero(@PathVariable final Long id, @RequestBody final Hero hero) {
		Assert.isTrue(id.equals(hero.getId()), "id coincide");
		return heroService.updateHero(hero);
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public List<Hero> searchHeroes(@RequestParam("name") final String name) {
		return heroService.searchHeroes(name);
	}

}
