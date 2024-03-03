package com.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.siva.entity.PlayerEntity;
import com.siva.repo.Player_Repo_CurdRepo;
import com.siva.repo.Player_Repo_JpaRepo;
import com.siva.service.Pratice_JpaRepo_methods;

@SpringBootApplication
public class DataJpaLambokExpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DataJpaLambokExpApplication.class, args);
		@SuppressWarnings("unused")
		Player_Repo_CurdRepo player_Repo = configurableApplicationContext.getBean(Player_Repo_CurdRepo.class);
		PlayerEntity p1 = new PlayerEntity();
//		Pratice_curdRepo_methods pratice_curd_methods = new Pratice_curdRepo_methods();
//		String string = pratice_curd_methods.findById(player_Repo, p1);
//		System.out.println("string:::: "+string);
//		List<PlayerEntity> lis = player_Repo.findByPlayerAgeBetween(0,30);
//		lis.forEach(obj ->{
//			System.out.println("obj:::: "+obj);
//		});
		
//		List<PlayerEntity> lisc = player_Repo.RecordsHql(20);
//		lisc.forEach(obj1->{
//			System.out.println(obj1);
//		});
//	}
		
		Player_Repo_JpaRepo player_Repo_Jpa = configurableApplicationContext.getBean(Player_Repo_JpaRepo.class);
//		Pratice_JpaRepo_methods pratice_jpa_methods = new Pratice_JpaRepo_methods();
//		String string = pratice_jpa_methods.QBE(player_Repo_Jpa,p1);
//		System.out.println("string:::: "+string);
		p1.setPlayerId(122);
		PlayerEntity save = player_Repo_Jpa.save(p1);
		System.out.println("svae:::"+save);
		
	}
}
