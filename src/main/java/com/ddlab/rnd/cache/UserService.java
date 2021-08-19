package com.ddlab.rnd.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.ehcache.CacheManager;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public void saveUser(AppUser user) {
		repo.save(user);
	}
	
	public AppUser getUserById(Long id) {
		AppUser user = repo.findById(id).get();
		int cacheSize = CacheManager.ALL_CACHE_MANAGERS.size();
		System.out.println("Cache Size: "+cacheSize);
		int size = CacheManager.ALL_CACHE_MANAGERS.get(0)
				  .getCache("com.ddlab.rnd.cache.AppUser").getSize();
		System.out.println("Cache Size : "+size);
		return user;
	}

}
