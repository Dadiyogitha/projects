package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.entities.User;

public interface UserRespository extends JpaRepository<User,Integer>   {

}
