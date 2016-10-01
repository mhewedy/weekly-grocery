package weeklygrocery.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Plan extends BaseEntity {

	private static final long serialVersionUID = 7879917882804773401L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@OneToMany
	@JoinColumn(name = "plan_id")
	private List<Item> items;

	@ManyToOne
	@JoinColumn(nullable = false, updatable = false)
	private User user;
}
