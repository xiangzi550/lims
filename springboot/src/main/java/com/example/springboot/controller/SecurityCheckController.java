package com.example.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.SecurityCheck;
import com.example.springboot.service.ISecurityCheckService;
import com.example.springboot.utils.DateUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  安全检查前端控制器
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@CrossOrigin
@RestController
@RequestMapping("/securitycheck")
public class SecurityCheckController {

@Resource
private ISecurityCheckService securityCheckService;
//*新增或更新
@PostMapping
public boolean save(@RequestBody SecurityCheck securityCheck){
        try {
            securityCheck.setCheckDate(DateUtil.getDateFormatStrYYMMDDHHmmSS());
        }catch (Exception e){
            e.printStackTrace();
        }
        return securityCheckService.saveOrUpdate(securityCheck);
}

@DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){

        return securityCheckService.removeById(id);
}
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return securityCheckService.removeBatchByIds(ids);
}
@GetMapping
public List<SecurityCheck> findAll(){

        return securityCheckService.list();
}
@GetMapping("/{username}")
public SecurityCheck findOne(@PathVariable Integer username) {
        return securityCheckService.getById(username);
        }

@GetMapping("/page")
public Page<SecurityCheck> findPage(@RequestParam Integer pageNum,
                                   @RequestParam Integer pageSize,
                                   @RequestParam(defaultValue = "") String labno,
                                   @RequestParam(defaultValue = "") String dutyusrno) {

                QueryWrapper<SecurityCheck> queryWrapper = new QueryWrapper<>();
                queryWrapper.orderByDesc("check_date");
                if(!"".equals(labno)) {
                        queryWrapper.like("labno", labno);
                }
                if(!"".equals(dutyusrno)) {
                        queryWrapper.like("duty_usr_no",dutyusrno);
                }

                return securityCheckService.page(new Page<>(pageNum, pageSize),queryWrapper);
}




}