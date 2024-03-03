package com.siva.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.siva.entity.PlayerEntity;
import com.siva.repo.Player_Repo_CurdRepo;

//@Component
public class Pratice_curdRepo_methods {

	public String ref(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {

		return "ref success";
	}

	public String save(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		//p.setPlayerId(103);
		p.setPlayerName("player_2");
		p.setPlayerAge(0);
		p.setLocation("MYD_edit");
		PlayerEntity playerEntityres = player_Repo.save(p);
		System.out.println(playerEntityres.toString());
		return "save success";
	}
	
	public String saveAll(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		//p.setPlayerId(104);
		p.setPlayerName("player_2");
		p.setPlayerAge(0);
		p.setLocation("MYD_edit");
		
		PlayerEntity p1 = new PlayerEntity();
		//p1.setPlayerId(105);
		p1.setPlayerName("player_2");
		p1.setPlayerAge(0);
		p1.setLocation("MYD_edit");
		
		List<PlayerEntity> list = new ArrayList<PlayerEntity>();
		list.add(p);
		list.add(p1);
		Iterable<PlayerEntity> listres = player_Repo.saveAll(list);
		for(PlayerEntity x:listres) {
		System.out.println(x.toString());
		}
		return "saveAll success";
	}
	public String findById(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		Optional<PlayerEntity> res = player_Repo.findById(104);
		if(res.isPresent()) {
			PlayerEntity p2 = res.get();
			if(p2 instanceof PlayerEntity) {
				System.out.println("res::::: "+res);
				p2.setPlayerAge(20);
				player_Repo.save(p2);
			}
		}
		return "findById success";
	}
	public String findAll(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		Iterable<PlayerEntity> all = player_Repo.findAll();
		System.out.println("all ::: "+all);
		return "findAll success";
	}
	public String count(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		long count = player_Repo.count();
		System.out.println("count::: "+count);
		return "count success";
	}
	public String existsById(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		boolean existsById = player_Repo.existsById(101);
		System.out.println("existsById::: "+existsById);
		return "existsById success";
	}
	
	public String deleteById(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		player_Repo.deleteById(101);
		return "deleteById success";
	}
	public String deleteAll(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		player_Repo.deleteAll();
		return "deleteAll success";
	}
	public String delete(Player_Repo_CurdRepo player_Repo,PlayerEntity p) {
		//p.setPlayerId(103);
		p.setPlayerName("player_2");
		p.setPlayerAge(0);
		p.setLocation("MYD_edit");
		player_Repo.delete(p);
		return "delete success";
	}
	

}
