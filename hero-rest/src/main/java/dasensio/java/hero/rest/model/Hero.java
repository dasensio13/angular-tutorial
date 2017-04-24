package dasensio.java.hero.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "HERO")
public class Hero extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 788895978260725235L;

	@Column(unique = true, nullable = false)
	@NotNull
	private String name;

	public Hero() {
		super();
	}

	public Hero(final Long id, final String name) {
		super();
		setId(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
