

package com.ark.cloud.modules.sys.service;

import com.ark.cloud.modules.sys.entity.SysRoleMenuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;



/**
 * 角色与菜单对应关系
 *
 * @author peixiuyue
 */
public interface SysRoleMenuService extends IService<SysRoleMenuEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
	
}
