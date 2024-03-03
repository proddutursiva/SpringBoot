package com.siva.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.siva.entity.PlayerEntity;

public interface Player_Repo_CurdRepo extends CrudRepository<PlayerEntity, Integer> {
	//findBy methods
	public List<PlayerEntity> findByLocation(String location);
	public List<PlayerEntity> findByPlayerAge(int age);
	public List<PlayerEntity> findByPlayerAgeGreaterThanEqual(int age);
	public List<PlayerEntity> findByPlayerAgeIsLessThan(int age);
	public List<PlayerEntity> findByPlayerAgeAndPlayerName(int age,String playerName);
	public List<PlayerEntity> findByPlayerAgeIn(List<Integer> lis);
	public List<PlayerEntity> findByPlayerAgeBetween(int age, int age1);
	
	//custom Querys
	
	@Query(value = "from PlayerEntity")
	public List<PlayerEntity> allRecordsHql();
	
	@Query(value = "select * from CRICKET_PLAYERS", nativeQuery= true)
	public List<PlayerEntity> allRecordsSql();

	@Query(value = "from PlayerEntity where playerAge =:age")
	public List<PlayerEntity> RecordsHql(int age);
	
	@Query(value = "select * from CRICKET_PLAYERS where playerAge =:age and PLAYER_NAME =:playername", nativeQuery= true)
	public List<PlayerEntity> RecordsSql(int age,String playername);

}
