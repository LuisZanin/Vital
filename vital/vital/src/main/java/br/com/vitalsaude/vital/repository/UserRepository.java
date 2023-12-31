package br.com.vitalsaude.vital.repository;


import br.com.vitalsaude.vital.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
        User findByLogin(String login);
}