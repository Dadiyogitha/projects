package in.sp.app.Respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.Entities.User;

public interface UserRepository extends JpaRepository<User,Integer>   {
	List<User> findByUsernameAndPassword(String username, String password);

}
