package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author Emmanuel Bernard
 */
@Entity
public class User {
	private Long id;
	private String nonPersistent;
	private String name;

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Transient
	public String getNonPersistent() {
		return nonPersistent;
	}

	public void setNonPersistent(String nonPersistent) {
		this.nonPersistent = nonPersistent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
