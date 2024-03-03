package com.siva.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.siva.entity.PlayerEntity;
import com.siva.repo.Player_Repo_JpaRepo;

//@Component
public class Pratice_JpaRepo_methods {

	public String ref(Player_Repo_JpaRepo player_Repo,PlayerEntity p) {

		return "ref success";
	}
	public String findAll(Player_Repo_JpaRepo player_Repo,PlayerEntity p) {

		List<PlayerEntity> all = player_Repo.findAll();
		all.forEach(record->{
			System.out.println(record);
		});
		return "findAll success";
	}
	public String findalldesc(Player_Repo_JpaRepo player_Repo,PlayerEntity p) {
		List<PlayerEntity> all = player_Repo.findAll(Sort.by("playerAge").descending());
		all.forEach(record->{
			System.out.println(record);
		});
		return "ref success";
	}
	public String pagination(Player_Repo_JpaRepo player_Repo,PlayerEntity p) {
		PageRequest pagereq = PageRequest.of(0,3);
		Page<PlayerEntity> all = player_Repo.findAll(pagereq);
		List<PlayerEntity> content = all.getContent();
		content.forEach(record->{
			System.out.println(record);
		});
		return "pagination success";
	}
	
	//QBE
	public String QBE(Player_Repo_JpaRepo player_Repo,PlayerEntity p) {
		p.setPlayerAge(20);
		Example<PlayerEntity> example = Example.of(p);
		List<PlayerEntity> all = player_Repo.findAll(example);
		all.forEach(record->{
			System.out.println(record);
		});
		return "QBE success";
	}
	
}
