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
	// ��������1
	public abstract boolean exists(User1 u) throws Exception;

	// ��������2
	public abstract void add(User1 u) throws Exception;

	// ���ע���û�
	public void save(InstitutionReInfoModel u) throws Exception;

	// ��¼��⣬�û��������Ƿ���ͬ
	public abstract boolean loginCheck(InstitutionReInfoModel I)
			throws Exception;

	// ��¼�û���ɫ���
	public abstract int roleCheck(int I) throws Exception;

	// �������Ʋ���
	public abstract boolean institutionNameCheck(InstitutionInfoModel I)
			throws Exception;

	// ��ӻ�����Ϣ
	public void institutionAdd(InstitutionInfoModel I) throws Exception;

	// �������
	public void demandAdd(DemandInfoModel I) throws Exception;

	public void demandUpdate(DemandInfoModel I) throws Exception;

	// Ϊ��Ӧʹ���û��о�����
	public List<DemandInfoModel> listDemands(int I) throws Exception;

	// Ϊ��ʽ�����Ա�о�δͨ���������
	public List<DemandInfoModel> listDemandsForXing() throws Exception;

	// Ϊ��ʽ�����Ա�о���ͨ���������
	public List<DemandInfoModel> listYiDemandsForXing() throws Exception;

	// ��������Ĳ�����Ϣ���ҵ���Ӧ��������Ϣ
	public List<DemandInfoModel> listDemandsForBu(String label2)
			throws Exception;

	// Ϊ���������Ա�о������
	public List<DemandInfoModel> listYiDemandsForBu(String label2)
			throws Exception;

	//
	public InstitutionInfoModel showInfo(String D) throws Exception;

	//
	public void modifyPassword(InstitutionReInfoModel I) throws Exception;

	public List<InstitutionReInfoModel> findInstitutionByID(int institutionid)
			throws Exception;

	public DemandInfoModel findDemandById(int I) throws Exception;

	// ����userid���ҵ���Ӧ�û�Ȼ�󷵻��û��Ĺ���������Ϣ
	public String findBumen(int user) throws Exception;

	// ���ϲ�ѯ
	public List<DemandInfoModel> search(SearchModelVo search) throws Exception;

	// ʹ���û�ɾ���Լ�������
	public void demandDelete(int D) throws Exception;

	// ��ѯ���й�ڹ�����
	public List<GuiModel> getGui();

	// ��ѯ�������ڵ���
	public List<SuoModel> getSuo();
	
	//����ѧ�Ʒ�����в���
	public List<DemandInfoModel>searchDemandByXueke(String D) throws SQLException;
}