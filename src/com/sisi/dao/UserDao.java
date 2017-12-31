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

	// Ϊʹ���û����ҳ��������������
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

	// ɾ��ʹ���û���Ҫɾ��������
	public void demandDelete(int D);

	// ��ѯ���й�ڹ�����
	public List<GuiModel> getGui();

	// ��ѯ�������ڵ���
	public List<SuoModel> getSuo();
	
	//��ȡ���й��񾭼���ҵһ��Ŀ¼
	public List<JingjihangyeModel> getYi();
	
	//��ȡ���й��񾭼���ҵ����Ŀ¼
	public List<JingjihangyeModel> getEr(String tiaojian);
	
	//����ѧ�ƽ��в���
	public List<DemandInfoModel> searchDemandByXueke(String D) throws SQLException;
}
