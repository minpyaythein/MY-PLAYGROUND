package backend.myplayground.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.myplayground.entity.Members;

public interface MembersRepository extends JpaRepository<Members, Integer> {

}