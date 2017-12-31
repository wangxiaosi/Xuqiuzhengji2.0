package com.sisi.service.impl;

/*
 * ��ʱ���������ʣ�Ϊʲô���һ��дһ��service�㣬ֻ�ǵ�������ͬ���ܵĺ���
 * ����exists������checkUserExistsWithName����������ŵ��Ǻ��溯����
 * ��ֱ�Ӵ�ǰ�ߵĿ�����ȥ�ģ��������Ƕ��һ�٣�û��������Ҳһ��������Ҫ�뵽��
 * ʵ���������п���ͬʱ���ö��dao��ʵ��һ�����ܣ���ô�����ǲ���ȡ����
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
	// ����*******************************************************
	private UserDao userDao;

	// setget����*************************************************
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// ��������*************************************************
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

	// ��ɫ�鿴
	public int roleCheck(int I) throws Exception {
		return userDao.roleCheck(I);
	}

	// �������ֲ���
	public boolean institutionNameCheck(InstitutionInfoModel I)
			throws Exception {
		// TODO Auto-generated method stub
		return userDao.institutionNameCheck(I.getInstitutionname());
	}

	// ��ӻ�����Ϣ
	public void institutionAdd(InstitutionInfoModel I) throws Exception {
		userDao.institutionAdd(I);
	}

	// ���������Ϣ
	public void demandAdd(DemandInfoModel I) throws Exception {
		// TODO Auto-generated method stub
		userDao.demandAdd(I);
	}

	// ���������Ϣ
	public void demandUpdate(DemandInfoModel I) throws Exception {
		userDao.demandUpdate(I);
	}

	// �������н��
	public List<DemandInfoModel> listDemands(int I) throws Exception {
		return userDao.getDemands(I);
	}

	// ��ʾ�û�
	public InstitutionInfoModel showInfo(String D) throws Exception {
		System.out.println("2." + D);
		int d = Integer.parseInt(D);
		return userDao.showInfo(d);
	}

	// �޸�����
	public void modifyPassword(InstitutionReInfoModel I) throws Exception {
		userDao.modifyPassword(I);
		System.out.println(I.getPassword());
	}

	// ����id���һ���
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

	// ���ϲ�ѯ
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
