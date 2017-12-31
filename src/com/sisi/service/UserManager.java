package com.sisi.service;

import java.sql.SQLException;
import java.util.List;

import com.sisi.model.DemandInfoModel;
import com.sisi.model.GuiModel;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.model.SuoModel;
import com.sisi.model.User1;
import com.sisi.vo.SearchModelVo;

public interface UserManager {
	// 试例函数1
	public abstract boolean exists(User1 u) throws Exception;

	// 试例函数2
	public abstract void add(User1 u) throws Exception;

	// 添加注册用户
	public void save(InstitutionReInfoModel u) throws Exception;

	// 登录检测，用户名密码是否相同
	public abstract boolean loginCheck(InstitutionReInfoModel I)
			throws Exception;

	// 登录用户角色检查
	public abstract int roleCheck(int I) throws Exception;

	// 机构名称查重
	public abstract boolean institutionNameCheck(InstitutionInfoModel I)
			throws Exception;

	// 添加机构信息
	public void institutionAdd(InstitutionInfoModel I) throws Exception;

	// 添加需求
	public void demandAdd(DemandInfoModel I) throws Exception;

	public void demandUpdate(DemandInfoModel I) throws Exception;

	// 为对应使用用户列举需求
	public List<DemandInfoModel> listDemands(int I) throws Exception;

	// 为形式审核人员列举未通过审核需求
	public List<DemandInfoModel> listDemandsForXing() throws Exception;

	// 为形式审核人员列举已通过审核需求
	public List<DemandInfoModel> listYiDemandsForXing() throws Exception;

	// 根据输入的部门信息查找到相应的需求信息
	public List<DemandInfoModel> listDemandsForBu(String label2)
			throws Exception;

	// 为部门审核人员列举已审核
	public List<DemandInfoModel> listYiDemandsForBu(String label2)
			throws Exception;

	//
	public InstitutionInfoModel showInfo(String D) throws Exception;

	//
	public void modifyPassword(InstitutionReInfoModel I) throws Exception;

	public List<InstitutionReInfoModel> findInstitutionByID(int institutionid)
			throws Exception;

	public DemandInfoModel findDemandById(int I) throws Exception;

	// 按照userid查找到相应用户然后返回用户的归属部门信息
	public String findBumen(int user) throws Exception;

	// 联合查询
	public List<DemandInfoModel> search(SearchModelVo search) throws Exception;

	// 使用用户删除自己的需求
	public void demandDelete(int D) throws Exception;

	// 查询所有归口管理部门
	public List<GuiModel> getGui();

	// 查询所有所在地域
	public List<SuoModel> getSuo();
	
	//按照学科分类进行查找
	public List<DemandInfoModel>searchDemandByXueke(String D) throws SQLException;
}