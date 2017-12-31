package com.sisi.dao;

import java.sql.SQLException;
import java.util.List;

import com.sisi.model.DemandInfoModel;
import com.sisi.model.GuiModel;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.model.JingjihangyeModel;
import com.sisi.model.SuoModel;
import com.sisi.model.User1;
import com.sisi.vo.SearchModelVo;

public interface UserDao {

	public void save(User1 u);

	public void save(InstitutionReInfoModel u);

	public boolean checkUserExistsWithName(String username);

	public boolean loginCheck(int id, String password);

	public int roleCheck(int institutionid);

	public boolean institutionNameCheck(String institutionname);

	public void institutionAdd(InstitutionInfoModel K);

	public void demandAdd(DemandInfoModel I);

	public void demandUpdate(DemandInfoModel I);

	// 为使用用户查找出所有已填报的需求
	public List<DemandInfoModel> getDemands(int I);

	public List<DemandInfoModel> getDemandsForXing();

	public List<DemandInfoModel> getYiDemandsForXing();

	public InstitutionInfoModel showInfo(int institutionname);

	public void modifyPassword(InstitutionReInfoModel I);

	public List<InstitutionReInfoModel> findInstitutionByID(int institutionid);

	public DemandInfoModel findDemandById(int demandid);

	public String findBumen(int institutionid);

	public List<DemandInfoModel> getDemandsForBu(String label2);

	public List<DemandInfoModel> getYiDemandsForBu(String label2);

	public List<DemandInfoModel> search(SearchModelVo search);

	// 删除使用用户想要删除的需求
	public void demandDelete(int D);

	// 查询所有归口管理部门
	public List<GuiModel> getGui();

	// 查询所有所在地域
	public List<SuoModel> getSuo();
	
	//获取所有国民经济行业一级目录
	public List<JingjihangyeModel> getYi();
	
	//获取所有国民经济行业二级目录
	public List<JingjihangyeModel> getEr(String tiaojian);
	
	//根据学科进行查找
	public List<DemandInfoModel> searchDemandByXueke(String D) throws SQLException;
}
