package hu.angerz.framework.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface  GreetingRepository  extends JpaRepository<Greeting, Long> {

}
