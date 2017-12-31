package com.sisi.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sisi.model.DemandInfoModel;
import com.sisi.service.UserManager;
import com.sisi.vo.DemandInfoModelVo;
import com.sisi.vo.SearchModelVo;

public class DemandSearchAction extends ActionSupport implements ModelDriven {
	// 属性
	private SearchModelVo search;

	private List<DemandInfoModel> demands;

	private UserManager um;

	private DemandInfoModel demand;

	//用来帮助按照学科进行查找
	private DemandInfoModel demandhelp;

	// set,get方法
	
	public DemandInfoModel getDemandhelp() {
		return demandhelp;
	}

	public void setDemandhelp(DemandInfoModel demandhelp) {
		this.demandhelp = demandhelp;
	}

	public SearchModelVo getSearch() {
		return search;
	}

	@Resource(name = "search")
	public void setSearch(SearchModelVo search) {
		this.search = search;
	}

	public UserManager getUm() {
		return um;
	}

	@Resource(name = "userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public List<DemandInfoModel> getDemands() {
		return demands;
	}

	// 调取表中所有数据
	public void setDemands(List<DemandInfoModel> demands) {
		this.demands = demands;
	}

	public Object getModel() {
		return search;
	}

	public DemandInfoModel getDemand() {
		return demand;
	}

	public void setDemand(DemandInfoModel demand) {
		this.demand = demand;
	}

	// 其他方法**************************************************************

	@Override
	public String execute() throws Exception {
		return "true";
	}

	// 综合查询
	public String search() throws Exception {
		this.demands = um.search(search);
		return "true";
	}

	// 查询出详细信息
	public String searchDemandById() throws Exception {
		this.demand = um.findDemandById(demand.getDemandid());
		return "true";
	}
	
	public String searchDemandByXueke() throws Exception {
		System.out.println(demandhelp.getXuekefenlei());
		this.demands = um.searchDemandByXueke(demandhelp.getXuekefenlei());
		return "true";
	}
}
