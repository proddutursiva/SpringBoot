package com.siva.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.siva.entity.Composit_pk_;
import com.siva.entity.PlayerEntity;

public interface Player_Repo_JpaRepo extends JpaRepository<PlayerEntity, Composit_pk_> {
	
	
}
