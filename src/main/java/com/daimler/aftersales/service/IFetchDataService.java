package com.daimler.aftersales.service;

import com.daimler.aftersales.entity.*;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
public interface IFetchDataService {

    void insertBrand(List<BrandPOJO> brandPOJOS);
    void insertCertification(List<CertificationPOJO> certificationPOJOS);
    void insertCity(List<CityPOJO> cityPOJOS);
    void insertCMS_Account(List<CMSAccountPOJO> cmsAccountPOJOS);
    void insertCompany(List<CompanyPOJO> companyPOJOS);
    void insertDealer(List<DealerPOJO> dealerPOJOS);
    void insertDealerAccount(List<Dealeraccount> dealeraccounts);
    void insertDealerFormat(List<Dealerformat> dealerformats);
    void insertDealerFormatCode(List<Dealerformatcode> dealerformatcodes);
    void insertDealerGroup(List<Dealergroup> dealergroups);
    void insertDealerOwner(List<Dealerowner> dealerowners);
    void insertDimissionReason(List<Dimissionreason> dimissionreasons);
    void insertOChart(List<Ochart> ocharts);
    void insertOChartCustom(List<Ochartcustom> ochartcustoms);
    void insertProvince(List<Province> provinces);
    void insertQualification(List<Qualification> qualifications);
    void insertStaffPositionType(List<Staffpositiontype> staffpositiontypes);
    void insertStaffResume(List<Staffresume> staffresumes);
    void insertUserInfo(List<Userinfo> userinfos);
    void insertRegion(List<Region> regions);
    void insertRelation_RegionProvience(List<RelationRegionprovince> relationRegionprovinces);
    void insertRelation_AccountPosition(List<RelationAccountPositionPOJO> relationAccountPositionPOJOS);

    void fetchDataManager();

}
