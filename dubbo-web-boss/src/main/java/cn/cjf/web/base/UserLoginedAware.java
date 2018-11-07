package cn.cjf.web.base;


import cn.cjf.facade.entity.PmsUser;

public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
