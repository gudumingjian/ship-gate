package cn.sp.service;

import cn.sp.pojo.dto.AppRuleDTO;
import cn.sp.pojo.vo.RuleVO;

import java.util.List;

/**
 * @Author: Ship
 * @Description:
 * @Date: Created in 2020/12/28
 */
public interface RuleService {

    List<AppRuleDTO> getEnabledRule();

    void add(AppRuleDTO appRuleDTO);

    void delete(Integer id);

    List<RuleVO> queryList(String appName);
}
