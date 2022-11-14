package com.example.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.LabUseinfo;
import com.example.springboot.service.ILabUseInfoService;
import com.example.springboot.utils.DateUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  实验室服务前端控制器
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@CrossOrigin
@RestController
@RequestMapping("/labuseinfo")
public class LabUseInfoController {

@Resource
private ILabUseInfoService labUseInfoService;
//*新增或更新
@PostMapping
public boolean save(@RequestBody LabUseinfo labUseInfo){
        try {
            labUseInfo.setUseDate(DateUtil.getDateFormatStrYYMMDDHHmmSS());
        }catch (Exception e){
            e.printStackTrace();
        }
        return labUseInfoService.saveOrUpdate(labUseInfo);
}

@DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){

        return labUseInfoService.removeById(id);
}
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return labUseInfoService.removeBatchByIds(ids);
}
@GetMapping
public List<LabUseinfo> findAll(){

        return labUseInfoService.list();
}
@GetMapping("/{id}")
public LabUseinfo findOne(@PathVariable Integer id) {

    return labUseInfoService.getById(id);
 }

@GetMapping("/page")
public Page<LabUseinfo> findPage(@RequestParam Integer pageNum,
                                 @RequestParam Integer pageSize,
                                 @RequestParam(defaultValue = "") String labno,
                                 @RequestParam(defaultValue = "") String useusrno,
                                 @RequestParam(defaultValue = "") String dutyusrno) {

                QueryWrapper<LabUseinfo> queryWrapper = new QueryWrapper<>();
                queryWrapper.orderByDesc("use_date");
                if(!"".equals(labno)) {
                        queryWrapper.like("labno", labno);
                }
                if(!"".equals(dutyusrno)) {
                        queryWrapper.like("duty_usr_no",dutyusrno);
                }
                if(!"".equals(useusrno)) {
                   queryWrapper.like("use_usr_no",useusrno);
                }

                return labUseInfoService.page(new Page<>(pageNum, pageSize),queryWrapper);
}




}