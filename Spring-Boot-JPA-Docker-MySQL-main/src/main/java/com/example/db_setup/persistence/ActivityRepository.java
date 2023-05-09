package com.example.db_setup.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<activity, String> {

    activity findByName(String nome);

    List<activity> findAll();

    activity findByNomeAndLuogo(String nome, String luogo);
}
