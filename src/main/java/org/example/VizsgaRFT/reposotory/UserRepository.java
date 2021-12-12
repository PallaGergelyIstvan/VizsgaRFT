
package org.example.VizsgaRFT.reposotory;

import org.example.VizsgaRFT.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByNev(String nev);
}

