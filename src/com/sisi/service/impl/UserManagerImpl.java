package com.sisi.service.impl;

/*
 * 有时候会产生疑问，为什么多此一举写一个service层，只是调用了相同功能的函数
 * 像是exists调用了checkUserExistsWithName，当初最夸张的是后面函数就
 * 是直接从前边的拷贝过去的，这样不是多此一举，没有这个层次也一样。但是要想到其
 * 实这个服务层中可能同时调用多个dao来实现一个功能，那么它就是不可取代的
 * */
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sisi.dao.UserDao;
import com.sisi.model.DemandInfoModel;
import com.sisi.model.GuiModel;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.model.SuoModel;
import com.sisi.model.User1;
import com.sisi.service.UserManager;
import com.sisi.vo.SearchModelVo;

@Component("userManager")
public class UserManagerImpl implements UserManager {
	// 属性*******************************************************
	private UserDao userDao;

	// setget函数*************************************************
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// 其他函数*************************************************
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sisi.registration.service.impl.UserManager#exists(com.sisi.registration
	 * .model.User1)
	 */
	public boolean exists(User1 u) throws Exception {
		return userDao.checkUserExistsWithName(u.getUsername());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sisi.registration.service.impl.UserManager#add(com.sisi.registration
	 * .model.User1)
	 */
	public void add(User1 u) throws Exception {
		userDao.save(u);
	}

	public void save(InstitutionReInfoModel u) throws Exception {
		userDao.save(u);
	}

	public boolean loginCheck(InstitutionReInfoModel I) throws Exception {
		return userDao.loginCheck(I.getInstitutionid(), I.getPassword());
	}

	// 角色查看
	public int roleCheck(int I) throws Exception {
		return userDao.roleCheck(I);
	}

	// 机构名字查重
	public boolean institutionNameCheck(InstitutionInfoModel I)
			throws Exception {
		// TODO Auto-generated method stub
		return userDao.institutionNameCheck(I.getInstitutionname());
	}

	// 添加机构信息
	public void institutionAdd(InstitutionInfoModel I) throws Exception {
		userDao.institutionAdd(I);
	}

	// 添加需求信息
	public void demandAdd(DemandInfoModel I) throws Exception {
		// TODO Auto-generated method stub
		userDao.demandAdd(I);
	}

	// 添加需求信息
	public void demandUpdate(DemandInfoModel I) throws Exception {
		userDao.demandUpdate(I);
	}

	// 查找所有结果
	public List<DemandInfoModel> listDemands(int I) throws Exception {
		return userDao.getDemands(I);
	}

	// 显示用户
	public InstitutionInfoModel showInfo(String D) throws Exception {
		System.out.println("2." + D);
		int d = Integer.parseInt(D);
		return userDao.showInfo(d);
	}

	// 修改密码
	public void modifyPassword(InstitutionReInfoModel I) throws Exception {
		userDao.modifyPassword(I);
		System.out.println(I.getPassword());
	}

	// 根据id查找机构
	public List<InstitutionReInfoModel> findInstitutionByID(int institutionid)
			throws Exception {
		return userDao.findInstitutionByID(institutionid);
	}

	public List<DemandInfoModel> listDemandsForXing() throws Exception {
		return userDao.getDemandsForXing();
	}

	public List<DemandInfoModel> listYiDemandsForXing() throws Exception {
		return userDao.getYiDemandsForXing();
	}

	public DemandInfoModel findDemandById(int I) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findDemandById(I);
	}

	public List<DemandInfoModel> listDemandsForBu(String label2)
			throws Exception {
		return userDao.getDemandsForBu(label2);
	}

	public String findBumen(int user) throws Exception {
		return userDao.findBumen(user);
	}

	public List<DemandInfoModel> listYiDemandsForBu(String label2)
			throws Exception {
		return userDao.getYiDemandsForBu(label2);
	}

	// 联合查询
	public List<DemandInfoModel> search(SearchModelVo search) throws Exception {
		return userDao.search(search);
	}

	public void demandDelete(int D) throws Exception {
		userDao.demandDelete(D);
	}

	public List<GuiModel> getGui() {
		return userDao.getGui();
	}

	public List<SuoModel> getSuo() {
		return userDao.getSuo();
	}

	public List<DemandInfoModel> searchDemandByXueke(String D) throws SQLException {
		
		return userDao.searchDemandByXueke(D);
	}
}
