package com.fishvideo.service;

import com.fishvideo.pojo.Users;
import com.fishvideo.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}
