package ProjetApp.dao.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import ProjetApp.dao.entities.User;


public interface IUserRepo extends JpaRepository<User, Integer>{

}
