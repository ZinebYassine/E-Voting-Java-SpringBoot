package ProjetApp.dao.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Electeur extends User{
	private String sexe;
	private int age;
	private String adresse;
	private int num;
}
