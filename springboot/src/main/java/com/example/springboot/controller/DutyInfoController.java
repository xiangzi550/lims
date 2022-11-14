package com.example.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.DutyInfo;
import com.example.springboot.service.IDutyInfoService;
import com.example.springboot.utils.DateUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  值班服务前端控制器
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@CrossOrigin
@RestController
@RequestMapping("/dutyinfo")
public class DutyInfoController {

@Resource
private IDutyInfoService dutyInfoService;
//*新增或更新
@PostMapping
public boolean save(@RequestBody DutyInfo dutyInfo){
        try {
            dutyInfo.setDutyDate(DateUtil.getDateFormatStrYYMMDDHHmmSS());
            dutyInfo.setPlanTime(dutyInfo.getPlanTime().split(" ")[0]);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dutyInfoService.saveOrUpdate(dutyInfo);
}

@DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){

        return dutyInfoService.removeById(id);
}
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return dutyInfoService.removeBatchByIds(ids);
}
@GetMapping
public List<DutyInfo> findAll(){

        return dutyInfoService.list();
}
@GetMapping("/{id}")
public DutyInfo findOne(@PathVariable Integer id) {
        return dutyInfoService.getById(id);
        }

@GetMapping("/page")
public Page<DutyInfo> findPage(@RequestParam Integer pageNum,
                                   @RequestParam Integer pageSize,
                                   @RequestParam(defaultValue = "") String labno,
                                   @RequestParam(defaultValue = "") String dutyusrno) {

                QueryWrapper<DutyInfo> queryWrapper = new QueryWrapper<>();
                queryWrapper.orderByDesc("duty_date");
                if(!"".equals(labno)) {
                        queryWrapper.like("labno", labno);
                }
                if(!"".equals(dutyusrno)) {
                        queryWrapper.like("duty_usr_no",dutyusrno);
                }

                return dutyInfoService.page(new Page<>(pageNum, pageSize),queryWrapper);
}




}