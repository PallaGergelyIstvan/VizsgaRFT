
package org.example.vizsgarft.reposotory;

import org.example.vizsgarft.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByNev(String nev);
}

