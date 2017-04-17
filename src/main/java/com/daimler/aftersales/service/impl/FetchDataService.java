package com.daimler.aftersales.service.impl;

import com.daimler.aftersales.Util.DecodeUtil;
import com.daimler.aftersales.Util.GenerateListFromMapUtil;
import com.daimler.aftersales.Util.JsonUtil;
import com.daimler.aftersales.entity.*;
import com.daimler.aftersales.iMappers.*;
import com.daimler.aftersales.service.IFetchDataService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
@Service
public class FetchDataService implements IFetchDataService {

    private static Logger logger = Logger.getLogger(FetchDataService.class);
    private static final String ACTION_GETALL = "Getall";
    private static final int STEP_SIZE = 3000;
    private static final int BRANCH_SIZE = 10;

    @Autowired
    private LoginInfo loginInfo;

    @Autowired
    private IBrandDao iBrandDao;


    @Autowired
    private RestTemplate restTemplate;

    @Value("${dic.api.url.Brand}")
    private String brandUrl;
    @Override
    public void insertBrand(List<BrandPOJO> brandList) {
        iBrandDao.truncate();
        logger.info("Insert brand data into DB started:" + brandList.size() + " records are going to insert");
        for (BrandPOJO brandPOJO : brandList) {
            iBrandDao.insertBrandData(brandPOJO);
        }
    }

    @Value("${dic.api.url.Certification}")
    private String certificationUrl;
    @Autowired
    private ICertificationDao iCertificationDao;
    @Override
    public void insertCertification(List<CertificationPOJO> certificationPOJOS) {
        iCertificationDao.truncate();
        logger.info("Insert certification data into db:"+certificationPOJOS.size()+" records are goiong to insert");
        int total = certificationPOJOS.size();
        List<List<CertificationPOJO>> certificationBranch = new ArrayList<>();
        int temp = 0;
        while (temp < total) {
            int end = ((temp + BRANCH_SIZE) < total) ? temp + BRANCH_SIZE : total;
            certificationBranch.add(certificationPOJOS.subList(temp, end));
            temp += BRANCH_SIZE;
        }
        int branchTotal = certificationBranch.size();
        for (int i = 0; i <= 9; i++) {
            int remain = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = remain;
                    while (j < branchTotal) {
                        iCertificationDao.insertList(certificationBranch.get(j));
                        j += 10;
                    }
                }
            }).start();
        }
    }

    @Value("${dic.api.url.City}")
    private String cityUrl;
    @Autowired
    private ICityDao iCityDao;
    @Override
    public void insertCity(List<CityPOJO> cityList) {
        iCityDao.truncate();
        logger.info("Insert city data into DB:"+cityList.size()+" records are going to insert");
        for (CityPOJO city : cityList) {
            iCityDao.insertCityData(city);
        }
    }

    @Value("${dic.api.url.CMSAccount}")
    private String cmsAccountUrl;
    @Autowired
    private ICMSAccountDao icmsAccountDao;
    @Override
    public void insertCMS_Account(List<CMSAccountPOJO> cmsAccountPOJOList) {
        icmsAccountDao.truncate();
        logger.info("Insert CMS_Account into DB:"+cmsAccountPOJOList.size()+" records are going to insert");
        int total = cmsAccountPOJOList.size();
        List<List<CMSAccountPOJO>> cmsAccountBranch = new ArrayList<>();
        int temp = 0;
        while (temp < total) {
            int end = ((temp + BRANCH_SIZE) < total) ? temp + BRANCH_SIZE : total;
            cmsAccountBranch.add(cmsAccountPOJOList.subList(temp, end));
            temp += BRANCH_SIZE;
        }
        int branchTotal = cmsAccountBranch.size();
        for (int i = 0; i <= 9; i++) {
            int remain = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = remain;
                    while (j < branchTotal) {
                        icmsAccountDao.insertList(cmsAccountBranch.get(j));
                        j += 10;
                    }
                }
            }).start();
        }
    }

    @Value("${dic.api.url.Company}")
    private String companyUrl;
    @Autowired
    private ICompanyDao iCompanyDao;
    @Override
    public void insertCompany(List<CompanyPOJO> companyPOJOList) {
        iCompanyDao.truncate();
        logger.info("Insert company data into DB:"+companyPOJOList.size()+" records are going to insert");
        for (CompanyPOJO companyPOJO : companyPOJOList) {
            iCompanyDao.insertCompanyData(companyPOJO);
        }
    }

    @Value("${dic.api.url.Dealer}")
    private String dealerUrl;
    @Autowired
    private IDealerDao iDealerDao;
    @Override
    public void insertDealer(List<DealerPOJO> dealerPOJOList) {
        iDealerDao.truncate();
        logger.info("Insert dealer data into DB:"+dealerPOJOList.size()+" records are going to insert");
        for (DealerPOJO dealerPOJO : dealerPOJOList) {
            iDealerDao.insertDealerData(dealerPOJO);
        }
    }

    @Value("${dic.api.url.DealerAccount}")
    private String dealerAccountUrl;
    @Autowired
    private DealeraccountMapper dealeraccountMapper;
    @Override
    public void insertDealerAccount(List<Dealeraccount> dealeraccounts) {
        List<List<Dealeraccount>> dealerAccountBranch = getBranchFromList(dealeraccounts);
        int branchTotal = dealerAccountBranch.size();
        dealeraccountMapper.truncate();
        logger.info("Insert DealerAccount data into DB:"+dealeraccounts.size()+" records are going to insert");
        for (int i = 0; i <= 9; i++) {
            int remain = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = remain;
                    while (j < branchTotal) {
                        dealeraccountMapper.insertList(dealerAccountBranch.get(j));
                        j += 10;
                    }
                }
            }).start();
        }
    }

    @Value("${dic.api.url.DealerFormat}")
    private String dealerFormatUrl;
    @Autowired
    private DealerformatMapper dealerformatMapper;
    @Override
    public void insertDealerFormat(List<Dealerformat> dealerformats) {
        dealerformatMapper.truncate();
        logger.info("Insert DealerFormat data into DB:"+dealerformats.size()+" records are going to insert");
        for (Dealerformat dealerformat : dealerformats) {
            dealerformatMapper.insert(dealerformat);
        }
    }

    @Value("${dic.api.url.DealerFormatCode}")
    private String dealerFormatCodeUrl;
    @Autowired
    private DealerformatcodeMapper dealerformatcodeMapper;
    @Override
    public void insertDealerFormatCode(List<Dealerformatcode> dealerformatcodes) {
        dealerformatcodeMapper.truncate();
        logger.info("Insert DealerFormat data into DB:"+dealerformatcodes.size()+" records are going to insert");
        for (Dealerformatcode dealerformatcode : dealerformatcodes) {
            dealerformatcodeMapper.insert(dealerformatcode);
        }
    }

    @Value("${dic.api.url.DealerGroup}")
    private String dealerGroupUrl;
    @Autowired
    private DealergroupMapper dealergroupMapper;
    @Override
    public void insertDealerGroup(List<Dealergroup> dealergroups) {
        dealergroupMapper.truncate();
        logger.info("Insert DealerGroup data into DB:"+dealergroups.size()+" records are going to insert");
        for (Dealergroup dealergroup : dealergroups) {
            dealergroupMapper.insert(dealergroup);
        }
    }

    @Value("${dic.api.url.DealerOwner}")
    private String dealerOwnerUrl;
    @Autowired
    private DealerownerMapper dealerownerMapper;
    @Override
    public void insertDealerOwner(List<Dealerowner> dealerowners) {
        dealerownerMapper.truncate();
        logger.info("Insert dealerowner data into DB:"+dealerowners.size()+" records are going to insert");
        for (Dealerowner dealerowner : dealerowners) {
            dealerownerMapper.insert(dealerowner);
        }
    }

    @Value("${dic.api.url.DimissionReason}")
    private String dimissionReasonUrl;
    @Autowired
    private DimissionreasonMapper dimissionreasonMapper;
    @Override
    public void insertDimissionReason(List<Dimissionreason> dimissionreasons) {
        dimissionreasonMapper.truncate();
        logger.info("Insert dimissionReason data into DB:"+dimissionreasons.size()+" records are going to insert");
        for (Dimissionreason dimissionreason : dimissionreasons) {
            dimissionreasonMapper.insert(dimissionreason);
        }
    }

    @Value("${dic.api.url.OChart}")
    private String oChartUrl;
    @Autowired
    private OchartMapper ochartMapper;
    @Override
    public void insertOChart(List<Ochart> ocharts) {
        List<List<Ochart>> ochartBranch = getBranchFromList(ocharts);
        int branchTotal = ochartBranch.size();
        ochartMapper.truncate();
        logger.info("Insert Ochart data into DB:"+ocharts.size()+" records are going to insert");
        for (int i = 0; i <= 9; i++) {
            int remain = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = remain;
                    while (j < branchTotal) {
                        ochartMapper.insertList(ochartBranch.get(j));
                        j += 10;
                    }
                }
            }).start();
        }
    }

    @Value("${dic.api.url.OChartCustom}")
    private String oChartCustomUrl;
    @Autowired
    private OchartcustomMapper ochartcustomMapper;
    @Override
    public void insertOChartCustom(List<Ochartcustom> ochartcustoms) {
        ochartcustomMapper.truncate();
        logger.info("Insert OchartCUstom data into DB:"+ochartcustoms.size()+" records are going to insert");
        for (Ochartcustom ochartcustom : ochartcustoms) {
            ochartcustomMapper.insert(ochartcustom);
        }
    }

    @Value("${dic.api.url.Province}")
    private String provinceUrl;
    @Autowired
    private ProvinceMapper provinceMapper;
    @Override
    public void insertProvince(List<Province> provinces) {
        provinceMapper.truncate();
        logger.info("Insert province data into DB:"+provinces.size()+" records are going to insert");
        for (Province province : provinces) {
            provinceMapper.insert(province);
        }
    }

    @Value("${dic.api.url.Qualification}")
    private String qualificationUrl;
    @Autowired
    private QualificationMapper qualificationMapper;
    @Override
    public void insertQualification(List<Qualification> qualifications) {
        qualificationMapper.truncate();
        logger.info("Insert qualification data into DB:"+qualifications.size()+" records are going to insert");
        for (Qualification qualification : qualifications) {
            qualificationMapper.insert(qualification);
        }
    }

    @Value("${dic.api.url.StaffPositionType}")
    private String staffPositionTypeUrl;
    @Autowired
    private StaffpositiontypeMapper staffpositiontypeMapper;
    @Override
    public void insertStaffPositionType(List<Staffpositiontype> staffpositiontypes) {
        staffpositiontypeMapper.truncate();
        logger.info("Insert staffPositionType data into DB:"+staffpositiontypes.size()+" records are going to insert");
        for (Staffpositiontype staffpositiontype : staffpositiontypes) {
            staffpositiontypeMapper.insert(staffpositiontype);
        }
    }

    @Value("${dic.api.url.StaffResume}")
    private String staffResumeUrl;
    @Autowired
    private StaffresumeMapper staffresumeMapper;
    @Override
    public void insertStaffResume(List<Staffresume> staffresumes) {
        List<List<Staffresume>> staffResumeBranch = getBranchFromList(staffresumes);
        int branchTotal = staffResumeBranch.size();
        staffresumeMapper.truncate();
        logger.info("Insert staffResume data into DB:"+staffresumes.size()+" records are going to insert");
        for (int i = 0; i <= 9; i++) {
            int remain = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = remain;
                    while (j < branchTotal) {
                        staffresumeMapper.insertList(staffResumeBranch.get(j));
                        j += 10;
                    }
                }
            }).start();
        }
    }

    @Value("${dic.api.url.UserInfo}")
    private String userInfoUrl;
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public void insertUserInfo(List<Userinfo> userinfos) {
        List<List<Userinfo>> userinfoBranch = getBranchFromList(userinfos);
        int branchTotal = userinfoBranch.size();
        userinfoMapper.truncate();
        logger.info("Insert UserInfo data into DB:"+userinfos.size()+" records are going to insert");
        for (int i = 0; i <= 9; i++) {
            int remain = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int j = remain;
                    while (j < branchTotal) {
                        userinfoMapper.insertList(userinfoBranch.get(j));
                        j += 10;
                    }
                }
            }).start();
        }
    }

    @Value("${dic.api.url.Region}")
    private String regionUrl;
    @Autowired
    private RegionMapper regionMapper;
    @Override
    public void insertRegion(List<Region> regions) {
        regionMapper.truncate();
        logger.info("Insert region data into DB:"+regions.size()+" records are going to insert");
        for (Region region : regions) {
            regionMapper.insert(region);
        }
    }

    @Value("${dic.api.url.Relation_RegionProvince}")
    private String relation_RegionUrl;
    @Autowired
    private RelationRegionprovinceMapper relationRegionprovinceMapper;
    @Override
    public void insertRelation_RegionProvience(List<RelationRegionprovince> relationRegionprovinces) {
        relationRegionprovinceMapper.truncate();
        logger.info("Insert RegionProvince data into DB:"+relationRegionprovinces.size()+" records are going to inesrt");
        for (RelationRegionprovince relationRegionprovince : relationRegionprovinces) {
            relationRegionprovinceMapper.insert(relationRegionprovince);
        }
    }

    @Override
    public void fetchDataManager() {
        //从api取数据,如果取数据出错返回null值，所有接口的数据都成功取到才开始插入数据库
        List<BrandPOJO> brandList = fetchObjectFromApi(brandUrl, BrandPOJO.class);
        if(brandList==null){
            logger.error("Fetch brand data failed");
            return;
        }else{
            logger.info("Fetch brand data succeed");
        }
        logger.info("Fetch Certification data starts");
        List<CertificationPOJO> certificationPOJOList = fetchObjectFromApi(certificationUrl, CertificationPOJO.class);
        if(certificationPOJOList==null){
            logger.error("Fetch certification data failed");
            return;
        }else{
            logger.info("Fetch certification data succeed");
        }
        logger.info("Fetch city data started");
        List<CityPOJO> cityList = fetchObjectFromApi(cityUrl, CityPOJO.class);
        if(cityList==null){
            logger.error("Fetch city data failed");
            return;
        }else{
            logger.info("Fetch city data succeed");
        }
        logger.info("Fetch CMS_Account starts");
        List<CMSAccountPOJO> cmsAccountPOJOList = fetchObjectFromApi(cmsAccountUrl, CMSAccountPOJO.class);
        if(cmsAccountPOJOList==null){
            logger.error("Fetch CMS_Account data failed");
            return;
        }else{
            logger.info("Fetch CMS_Account data succeed");
        }
        logger.info("Fetch company data started");
        List<CompanyPOJO> companyPOJOList = fetchObjectFromApi(companyUrl, CompanyPOJO.class);
        if(companyPOJOList==null){
            logger.error("Fetch company data failed");
            return;
        }else{
            logger.info("Fetch company data succeed");
        }
        logger.info("Fetch dealer data started");
        List<DealerPOJO> dealerPOJOList = fetchObjectFromApi(dealerUrl, DealerPOJO.class);
        if(dealerPOJOList==null){
            logger.error("Fetch dealer data failed");
            return;
        }else{
            logger.info("Fetch dealer data succeed");
        }
        logger.info("Fetch DealerAccount data started");
        List<Dealeraccount> dealeraccounts = fetchObjectFromApi(dealerAccountUrl, Dealeraccount.class);
        if(dealeraccounts==null){
            logger.error("Fetch DealerAccount data failed");
            return;
        }else{
            logger.info("Fetch DealerAccount data succeed");
        }
        logger.info("Fetch DealerFormat data started");
        List<Dealerformat> dealerformats = fetchObjectFromApi(dealerFormatUrl, Dealerformat.class);
        if(dealerformats==null){
            logger.error("Fetch DealerFormat data failed");
            return;
        }else{
            logger.info("Fetch DealerFormat data succeed");
        }
        logger.info("Fetch DealerFormat data started");
        List<Dealerformatcode> dealerformatcodes = fetchObjectFromApi(dealerFormatCodeUrl, Dealerformatcode.class);
        if(dealerformatcodes==null){
            logger.error("Fetch DealerFormat data failed");
            return;
        }else{
            logger.info("Fetch DealerFormat data succeed");
        }
        logger.info("Fetch DealerGroup data started");
        List<Dealergroup> dealergroups = fetchObjectFromApi(dealerGroupUrl, Dealergroup.class);
        if(dealergroups==null){
            logger.error("Fetch DealerGroup data failed");
            return;
        }else{
            logger.info("Fetch DealerGroup data succeed");
        }
        logger.info("Fetch DealerOwner data started");
        List<Dealerowner> dealerowners = fetchObjectFromApi(dealerOwnerUrl, Dealerowner.class);
        if(dealerowners==null){
            logger.error("Fetch dealerowner data failed");
            return;
        }else{
            logger.info("Fetch dealerowner data succeed");
        }
        logger.info("Fetch dimissionReason data started");
        List<Dimissionreason> dimissionreasons = fetchObjectFromApi(dimissionReasonUrl, Dimissionreason.class);
        if(dimissionreasons==null){
            logger.error("Fetch dimissionReason data failed");
            return;
        }else{
            logger.info("Fetch dimissionReason data succeed");
        }
        logger.info("Fetch Ochart data started");
        List<Ochart> ocharts = fetchObjectFromApi(oChartUrl, Ochart.class);
        if(ocharts==null){
            logger.error("Fetch Ochart data failed");
            return;
        }else{
            logger.info("Fetch Ochart data succeed");
        }
        logger.info("Fetch OchartCustom data started");
        List<Ochartcustom> ochartcustoms = fetchObjectFromApi(oChartCustomUrl, Ochartcustom.class);
        if(ochartcustoms==null){
            logger.error("Fetch OchartCustom data failed");
            return;
        }else{
            logger.info("Fetch OchartCustom data succeed");
        }
        logger.info("Fetch province data started");
        List<Province> provinces = fetchObjectFromApi(provinceUrl, Province.class);
        if(provinces==null){
            logger.error("Fetch province data failed");
            return;
        }else{
            logger.info("Fetch province data succeed");
        }
        logger.info("Fetch qualification data started");
        List<Qualification> qualifications = fetchObjectFromApi(qualificationUrl, Qualification.class);
        if(qualifications==null){
            logger.error("Fetch qualification data failed");
            return;
        }else{
            logger.info("Fetch qualification data succeed");
        }
        logger.info("Fetch staffPositionType data started");
        List<Staffpositiontype> staffpositiontypes = fetchObjectFromApi(staffPositionTypeUrl, Staffpositiontype.class);
        if(staffpositiontypes==null){
            logger.error("Fetch staffPositionType data failed");
            return;
        }else{
            logger.info("Fetch staffPositionType data succeed");
        }
        logger.info("Fetch staffResume data started");
        List<Staffresume> staffresumes = fetchObjectFromApi(staffResumeUrl, Staffresume.class);
        if(staffresumes==null){
            logger.error("Fetch staffResume data failed");
            return;
        }else{
            logger.info("Fetch staffResume data succeed");
        }
        logger.info("Fetch UserInfo data started");
        List<Userinfo> userinfos = fetchObjectFromApi(userInfoUrl, Userinfo.class);
        if(userinfos==null){
            logger.error("Fetch UserInfo data failed");
            return;
        }else{
            logger.info("Fetch UserInfo data succeed");
        }
        logger.info("Fetch region data started");
        List<Region> regions = fetchObjectFromApi(regionUrl, Region.class);
        if(regions==null){
            logger.error("Fetch region data failed");
            return;
        }else{
            logger.info("Fetch region data succeed");
        }
        logger.info("Fetch RegionProvince data started");
        List<RelationRegionprovince> relationRegionprovinces = fetchObjectFromApi(relation_RegionUrl, RelationRegionprovince.class);
        if(relationRegionprovinces==null){
            logger.error("Fetch RegionProvince data failed");
            return;
        }else{
            logger.info("Fetch RegionProvince data succeed");
        }
        //插入数据库
        insertBrand(brandList);
        insertCertification(certificationPOJOList);
        insertCity(cityList);
        insertCMS_Account(cmsAccountPOJOList);
        insertCompany(companyPOJOList);
        insertDealer(dealerPOJOList);
        insertDealerAccount(dealeraccounts);
        insertDealerFormat(dealerformats);
        insertDealerFormatCode(dealerformatcodes);
        insertDealerGroup(dealergroups);
        insertDealerOwner(dealerowners);
        insertDimissionReason(dimissionreasons);
        insertOChart(ocharts);
        insertOChartCustom(ochartcustoms);
        insertProvince(provinces);
        insertQualification(qualifications);
        insertStaffPositionType(staffpositiontypes);
        insertStaffResume(staffresumes);
        insertUserInfo(userinfos);
        insertRegion(regions);
        insertRelation_RegionProvience(relationRegionprovinces);
    }

    /**
     * Fetch a list of destination objects from url
     */
    private <T> List<T> fetchObjectFromApi(String url, Class<T> destObj) {
        List<T> list = new ArrayList<T>();
        int totalCount = getTotalCount(url);
        int page = (totalCount % STEP_SIZE == 0) ? totalCount / STEP_SIZE : totalCount / STEP_SIZE + 1;
        logger.info("Overall " + totalCount + " records are going to be fetched from " + url);
        for (int i = 1; i <= page; i++) {
            MultiValueMap requestEntity = new LinkedMultiValueMap<>();
            requestEntity.add("Token", loginInfo.getToken());
            requestEntity.add("Action", ACTION_GETALL);
            requestEntity.add("Page", String.valueOf(i));
            requestEntity.add("PageSize", String.valueOf(STEP_SIZE));
            String base64 = restTemplate.postForObject(url, requestEntity, String.class);
            String json = DecodeUtil.decode(base64, loginInfo.getKey());
            Map<String, List<Object>> resultMap = JsonUtil.getMapFromJson(json);
            list.addAll(GenerateListFromMapUtil.generateList(resultMap.get("Key"), resultMap.get("Data"), destObj));
            logger.info(i+"/"+page+" records has been fetched");
        }
        if(list.size()>=totalCount){
            logger.info(list.size()+" records are fetched actually");
            return list;
        }else{
            System.out.println(list.size());
            return null;
        }
    }


    private int getTotalCount(String url) {
        MultiValueMap requestEntity = new LinkedMultiValueMap<>();
        requestEntity.add("Token", loginInfo.getToken());
        requestEntity.add("Action", ACTION_GETALL);
        requestEntity.add("Page", "1");
        requestEntity.add("PageSize", "1");
        String base64 = restTemplate.postForObject(url, requestEntity, String.class);
        String json = DecodeUtil.decode(base64, loginInfo.getKey());
        Map<String, List<Object>> resultMap = JsonUtil.getMapFromJson(json);
        return (int) resultMap.get("TotalCount").get(0);
    }

    private <E> List<List<E>> getBranchFromList(List<E> list) {
        List<List<E>> branch = new ArrayList<>();
        int temp = 0;
        int total = list.size();
        while (temp < total) {
            int end = ((temp + BRANCH_SIZE) < total) ? temp + BRANCH_SIZE : total;
            branch.add(list.subList(temp, end));
            temp += BRANCH_SIZE;
        }
        return branch;
    }

}
