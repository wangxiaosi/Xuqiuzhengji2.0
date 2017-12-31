package com.sisi.dao.impl;

import java.sql.*;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sisi.dao.UserDao;
import com.sisi.model.DemandInfoModel;
import com.sisi.model.GuiModel;
import com.sisi.model.InstitutionInfoModel;
import com.sisi.model.InstitutionReInfoModel;
import com.sisi.model.JingjihangyeModel;
import com.sisi.model.SuoModel;
import com.sisi.model.User1;
import com.sisi.vo.SearchModelVo;
import com.sisi.model.DBean;

@Component("UserDao")
public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(User1 u) {
		getHibernateTemplate().save(u);
	}

	public boolean checkUserExistsWithName(String username) {
		List<User1> users = hibernateTemplate
				.find("from User1 u where u.username = '" + username + "'");

		if (users != null && users.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean loginCheck(int id, String password) {
		List<InstitutionReInfoModel> I = hibernateTemplate
				.find("from InstitutionReInfoModel u where u.institutionid = '"
						+ id + "' and u.password = '" + password + "'");

		if (I != null && I.size() > 0) {
			return true;
		}
		return false;
	}

	// ��ɫ���
	public int roleCheck(int institutionid) {
		System.out.println("���Ȩ����Ϣ��");
		InstitutionReInfoModel I1 = (InstitutionReInfoModel) hibernateTemplate
				.load(InstitutionReInfoModel.class, institutionid);
		return I1.getLabel();
	}

	// ������������Ƿ��ظ�
	public boolean institutionNameCheck(String institutionname) {
		List<InstitutionInfoModel> Institutions = hibernateTemplate
				.find("from InstitutionInfoModel I where I.institutionname = '"
						+ institutionname + "'");

		if (Institutions != null && Institutions.size() > 0) {
			return true;
		}
		return false;
	}

	// ��ӻ�����Ϣ
	public void institutionAdd(InstitutionInfoModel K) {
		System.out.println(K.getInstitutionid());
		hibernateTemplate.save(K);
	}

	// ���������Ϣ
	public void demandAdd(DemandInfoModel I) {
		hibernateTemplate.save(I);
	}

	// ���������Ϣ
	public void demandUpdate(DemandInfoModel I) {
		hibernateTemplate.update(I);
	}

	// �ҵ���������
	public List<DemandInfoModel> getDemands(int I) {
		List<DemandInfoModel> demands = hibernateTemplate
				.find("from DemandInfoModel D where D.institutionid = '" + I
						+ "'");
		return demands;
	}

	// ��ʾ�û���Ϣ
	public InstitutionInfoModel showInfo(int institutionid) {
		InstitutionInfoModel institution = (InstitutionInfoModel) hibernateTemplate
				.load(InstitutionInfoModel.class, institutionid);
		return institution;
	}

	// �޸�����
	public void modifyPassword(InstitutionReInfoModel I) {
		hibernateTemplate.update(I);
	}

	// ����id������Ӧ������Ϣ
	public List<InstitutionReInfoModel> findInstitutionByID(int institutionid) {

		List<InstitutionReInfoModel> Institutions = hibernateTemplate
				.find("from InstitutionReInfoModel I where I.institutionid = '"
						+ institutionid + "'");
		return Institutions;
	}

	// ����δͨ����ʽ������е�����
	public List<DemandInfoModel> getDemandsForXing() {
		List<DemandInfoModel> demands = hibernateTemplate
				.find("from DemandInfoModel D where D.shenhexs = '0'");
		return demands;
	}

	public DemandInfoModel findDemandById(int demandid) {
		DemandInfoModel demand = (DemandInfoModel) hibernateTemplate.load(
				DemandInfoModel.class, demandid);
		return demand;
	}

	// ����ͨ����ʽ������е�����
	public List<DemandInfoModel> getYiDemandsForXing() {
		List<DemandInfoModel> demands = hibernateTemplate
				.find("from DemandInfoModel D where D.shenhexs = '1'");
		return demands;
	}

	// ͨ��id�ҵ���Ӧ�Ĳ���
	public String findBumen(int institutionid) {
		InstitutionReInfoModel InstitutionReInfo = (InstitutionReInfoModel) hibernateTemplate
				.load(InstitutionReInfoModel.class, institutionid);
		return InstitutionReInfo.getLabel2();
	}

	// �����������δ�������
	public List<DemandInfoModel> getDemandsForBu(String label2) {
		List<DemandInfoModel> demands = hibernateTemplate
				.find("from DemandInfoModel D where D.shenhebm = '0' and D.guishubumen = '"
						+ label2 + "'");
		return demands;
	}

	// ������������Ѿ�������󣨵�����ͨ����ˣ�
	public List<DemandInfoModel> getYiDemandsForBu(String label2) {
		List<DemandInfoModel> demands = hibernateTemplate
				.find("from DemandInfoModel D where D.shenhebm != '0' and D.guishubumen = '"
						+ label2 + "'");
		return demands;
	}

	public List<DemandInfoModel> search(SearchModelVo search) {
		String hql = "from DemandInfoModel D";
		// 1 ģ�� 2 ���� 3 ���� 4 ������ϵ
		//��һ������***************************************************
		if (!search.getJiansuo1().equals(" ")&&!search.getJiansuo1().equals("")) 
		{
			String baifenhao = " '" + search.getJiansuo1() + "'";
			if (search.getMohu1().equals("like")) 
			{
				baifenhao = " '%" + search.getJiansuo1() + "%'";
			}
			hql = hql + " where D." + search.getJiansuotiaojian1() + " "
					+ search.getMohu1() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo1(" ");
			search.setJiansuotiaojian1(" ");
			search.setMohu1(" ");
		}
		//�ڶ�������***************************************************
		if (!search.getJiansuo2().equals(" ")&&!search.getJiansuo2().equals("")) 
		{
			// �ж�ǰһ��������Ƿ�Ϊ�գ����Ϊ����ô���Ϊ where���һ������
			String where = "";
			if (search.getJiansuo1().equals("")) 
			{
				where = " where D.";
			} 
			else 
			{
				where = " " + search.getJiansuoguanxi1() + " D.";
			}

			String baifenhao = " '" + search.getJiansuo2() + "'";
			if (search.getMohu2().equals("like")) 
			{
				baifenhao = " '%" + search.getJiansuo2() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian2() + " "
					+ search.getMohu2() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo2(" ");
			search.setJiansuotiaojian2(" ");
			search.setMohu2(" ");
			search.setJiansuoguanxi1(" ");
		}
		//����������***************************************************
		if (!search.getJiansuo3().equals(" ")&&!search.getJiansuo3().equals("")) 
		{
			String where = "";
			// ��������ǰ���ò��ü�where����˼�����ǲ��ǵ�һ������
			if (search.getJiansuo1().equals("")
					&& search.getJiansuo2().equals("")) 
			{
				where = " where D.";
			} 
			else 
			{
				where = " " + search.getJiansuoguanxi2() + " D.";
			}
			// ģ������
			String baifenhao = " '" + search.getJiansuo3() + "'";
			if (search.getMohu3().equals("like")) {
				baifenhao = " '%" + search.getJiansuo3() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian3() + " "
					+ search.getMohu3() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo3(" ");
			search.setJiansuotiaojian3(" ");
			search.setMohu3(" ");
			search.setJiansuoguanxi2(" ");
		}
		//���ĸ�����***************************************************
		if (!search.getJiansuo4().equals(" ")&&!search.getJiansuo4().equals("")) 
		{
			String where = "";
			// ��������ǰ���ò��ü�where����˼�����ǲ��ǵ�һ������
			if (search.getJiansuo1().equals("")
					&& search.getJiansuo2().equals("")
					&& search.getJiansuo3().equals("")) {
				where = " where D.";
			} else {
				where = " " + search.getJiansuoguanxi3() + " D.";
			}
			// ģ������
			String baifenhao = " '" + search.getJiansuo4() + "'";
			if (search.getMohu4().equals("like")) {
				baifenhao = " '%" + search.getJiansuo4() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian4() + " "
					+ search.getMohu4() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo4(" ");
			search.setJiansuotiaojian4(" ");
			search.setMohu4(" ");
			search.setJiansuoguanxi3(" ");
		}
		//���������***************************************************
		if (!search.getJiansuo5().equals(" ")&&!search.getJiansuo5().equals("")) 
		{
			String where = "";
			// ��������ǰ���ò��ü�where����˼�����ǲ��ǵ�һ������
			if (search.getJiansuo1().equals("")
					&& search.getJiansuo2().equals("")
					&& search.getJiansuo3().equals("")
					&& search.getJiansuo4().equals("")) 
			{
				where = " where D.";
			} 
			else 
			{
				where = " " + search.getJiansuoguanxi4() + " D.";
			}
			// ģ������
			String baifenhao = " '" + search.getJiansuo5() + "'";
			if (search.getMohu5().equals("like")) 
			{
				baifenhao = " '%" + search.getJiansuo5() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian5() + " "
					+ search.getMohu5() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo5(" ");
			search.setJiansuotiaojian5(" ");
			search.setMohu5(" ");
			search.setJiansuoguanxi4(" ");
		}
		//����������***************************************************
		if (!search.getJiansuo6().equals(" ")&&!search.getJiansuo6().equals("")) 
		{
			String where = "";
			// ��������ǰ���ò��ü�where����˼�����ǲ��ǵ�һ������
			if (search.getJiansuo1().equals("")
					&& search.getJiansuo2().equals("")
					&& search.getJiansuo3().equals("")
					&& search.getJiansuo4().equals("")
					&& search.getJiansuo5().equals("")) 
			{
				where = " where D.";
			} 
			else 
			{
				where = " " + search.getJiansuoguanxi5() + " D.";
			}
			// ģ������
			String baifenhao = " '" + search.getJiansuo6() + "'";
			if (search.getMohu6().equals("like")) 
			{
				baifenhao = " '%" + search.getJiansuo6() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian6() + " "
					+ search.getMohu6() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo6(" ");
			search.setJiansuotiaojian6(" ");
			search.setMohu6(" ");
			search.setJiansuoguanxi5(" ");
		}
		//���߸�����***************************************************
		if (!search.getJiansuo7().equals(" ")&&!search.getJiansuo7().equals("")) 
		{
			String where = "";
			// ��������ǰ���ò��ü�where����˼�����ǲ��ǵ�һ������
			if (search.getJiansuo1().equals("")
					&& search.getJiansuo2().equals("")
					&& search.getJiansuo3().equals("")
					&& search.getJiansuo4().equals("")
					&& search.getJiansuo5().equals("")
					&& search.getJiansuo6().equals("")) 
			{
				where = " where D.";
			} 
			else 
			{
				where = " " + search.getJiansuoguanxi6() + " D.";
			}
			// ģ������
			String baifenhao = " '" + search.getJiansuo7() + "'";
			if (search.getMohu7().equals("like")) 
			{
				baifenhao = " '%" + search.getJiansuo7() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian7() + " "
					+ search.getMohu7() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo7(" ");
			search.setJiansuotiaojian7(" ");
			search.setMohu7(" ");
			search.setJiansuoguanxi6(" ");
		}
		//�ڰ˸�����***************************************************
		if (!search.getJiansuo8().equals(" ")&&!search.getJiansuo8().equals("")) 
		{
			String where = "";
			// ��������ǰ���ò��ü�where����˼�����ǲ��ǵ�һ������
			if (search.getJiansuo1().equals("")
					&& search.getJiansuo2().equals("")
					&& search.getJiansuo3().equals("")
					&& search.getJiansuo4().equals("")
					&& search.getJiansuo5().equals("")
					&& search.getJiansuo6().equals("")
					&& search.getJiansuo7().equals("")) 
			{
				where = " where D.";
			} 
			else 
			{
				where = " " + search.getJiansuoguanxi7() + " D.";
			}
			// ģ������
			String baifenhao = " '" + search.getJiansuo8() + "'";
			if (search.getMohu8().equals("like")) 
			{
				baifenhao = " '%" + search.getJiansuo8() + "%'";
			}

			hql = hql + where + search.getJiansuotiaojian8() + " "
					+ search.getMohu8() + baifenhao;
			//�޸��Ժ��ʼ����Щֵ
			search.setJiansuo8(" ");
			search.setJiansuotiaojian8(" ");
			search.setMohu8(" ");
			search.setJiansuoguanxi7(" ");
		}
		System.out.println(hql);
		List<DemandInfoModel> demands = hibernateTemplate.find(hql);
		return demands;
	}

	// ɾ���û�ѡ�е�������Ϣ
	public void demandDelete(int D) {
		hibernateTemplate.delete(findDemandById(D));
	}

	public void save(InstitutionReInfoModel u) {
		getHibernateTemplate().save(u);
	}

	// ���ҵ����й�ڹ�����
	public List<GuiModel> getGui() {
		List<GuiModel> Gui = hibernateTemplate.find("from GuiModel D");
		return Gui;
	}

	public List<SuoModel> getSuo() {
		List<SuoModel> Suo = hibernateTemplate.find("from SuoModel S");
		return Suo;
	}

	public List<JingjihangyeModel> getYi() {
		List<JingjihangyeModel> Jing = hibernateTemplate.find("from JingjihangyeModel J where Code like '_0000'");
		return Jing;
	}
 
	//��ѯ��Ӧ�Ķ���Ŀ¼
	public List<JingjihangyeModel> getEr(String tiaojian) {
		List<JingjihangyeModel> Jing = hibernateTemplate.find("from JingjihangyeModel J where Code like '"+ tiaojian +"__00'");
		return Jing;
	}

	public List<DemandInfoModel> searchDemandByXueke(String D) throws SQLException {
		DBean db = new DBean();
		String Sql = "select * from xueke where Code = '" + D + "'";
		String title = null;
		ResultSet rs2 = db.executeQuery(Sql);
		System.out.println(Sql);
		while (rs2.next()) {
			title = rs2.getString(2);
		}
		List<DemandInfoModel> demands = hibernateTemplate
				.find("from DemandInfoModel D where D.xuekefenlei = '"+ title + "'");
		return demands;
	}
}
