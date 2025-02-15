package com.kh.myapp.cl.model.service;

import com.kh.myapp.cl.model.dao.ClassDao;
import com.kh.myapp.cl.model.vo.Class;
import com.kh.myapp.cl.model.vo.Menu;
import com.kh.myapp.cl.model.vo.Reserve;
import com.kh.myapp.cl.model.vo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ClassService {

    @Autowired
    private ClassDao dao;

    public ClassService() {
        super();
    }

    public HashMap<String, Object> classList(int reqPage) {
        //한페이지당 게시물 지정
        int numPerPage = 12;

        int end = numPerPage * reqPage;
        int start = (end - numPerPage) + 1;
        HashMap<String, Object> map = new HashMap<String,Object>();
        map.put("start",start);
        map.put("end",end);

        ArrayList<Class> list = dao.classList(map);
        //System.out.println(list);
        //페이징 처리하기 위한 수
        int totalCnt = dao.countAllList();
        //전체페이지
        int totalPage = 0;
        if(totalCnt % numPerPage == 0) {
            totalPage = totalCnt / numPerPage;
        }else {
            totalPage = totalCnt / numPerPage + 1;
        }
        //네비게이션 사이즈
        int pageNaviSize = 5;

        //페이지 네비게이션 시작번호 지정
        int pageNo = ((reqPage-1)/pageNaviSize)*pageNaviSize + 1;
        // 페이지 네비게이션 제작
        String pageNavi = "";
        //이전버튼
        if(pageNo != 1) {
            pageNavi += "<a href='/storeList.do?reqPage=" +(pageNo - 1) + "'><span class='material-symbols-outlined' style='font-size: 30px;'>\r\n" +
                    "            chevron_left\r\n" +
                    "            </span></a>";
        }

        for(int i = 0; i < pageNaviSize; i++) {
            if(reqPage == pageNo) {
                pageNavi += "<span class='numberDeco'>" + pageNo + "</span>";
            }else {
                pageNavi += "<a href='/storeList.do?reqPage=" + pageNo + "'><span>" + (pageNo) + "</span></a>";
            }
            pageNo++;
            if(pageNo > totalPage) {
                break;
            }
        }
        //다음버튼
        if(pageNo <= totalPage) {
            pageNavi += "<a href='/storeList.do?reqPage=" + pageNo + "'><span class='material-symbols-outlined' style='font-size: 30px;'>\r\n" +
                    "            chevron_right\r\n" +
                    "            </span></a>";
        }
        HashMap<String, Object> classListMap = new HashMap<String, Object>();
        classListMap.put("list", list);
        classListMap.put("reqPage", reqPage);
        classListMap.put("pageNavi", pageNavi);
        classListMap.put("total", totalPage);
        classListMap.put("pageNo", pageNo);

        if(list == null) {
            return null;
        }else {
            return classListMap;
        }
    }


    public HashMap<String, Object> selectOneClass(int classNo, String bookmarkId) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Class c = dao.selectOneClass(classNo);
        map.put("s", c);
        return map;
    }

    public ArrayList<Review> selectReviewList(int classNo) {
        return dao.selectReviewList(classNo);
    }

    //맛집 상세 - 메뉴 조회
    public ArrayList<Menu> selectMenuList(int classNo) {
        ArrayList<Menu> list = dao.selectMenuList(classNo);
        return list;
    }

    //예약된 시간 버튼 비활성화
    public ArrayList<Reserve> ajaxCheckReserve(Reserve r) {
        ArrayList<Reserve> list = dao.checkReserve(r);
        return list;
    }

    //비활성화 시간 확인하기
    public ArrayList<Reserve> ajaxCheckReserveTime(String selectDate, int maxNum, int classNo) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("selectDate",selectDate);
        map.put("maxNum",maxNum);
        map.put("classNo",classNo);
        ArrayList<Reserve> list = dao.ajaxCheckReserveTime(map);
        return list;
    }

    // 클래스 등록
    public int addClassAc(Class cv)
    {
        int result = dao.addClassAc(cv);
        return result;
    }


}
