package com.example.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.CleanInfo;
import com.example.springboot.service.ICleanInfoService;
import com.example.springboot.utils.DateUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  消杀服务前端控制器
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@CrossOrigin
@RestController
@RequestMapping("/cleaninfo")
public class CleanInfoController {

@Resource
private ICleanInfoService cleanInfoService;
//*新增或更新
@PostMapping
public boolean save(@RequestBody CleanInfo cleanInfo){
        try {
            cleanInfo.setCleanDate(DateUtil.getDateFormatStrYYMMDDHHmmSS());
        }catch (Exception e){
            e.printStackTrace();
        }
        return cleanInfoService.saveOrUpdate(cleanInfo);
}

@DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){

        return cleanInfoService.removeById(id);
}
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return cleanInfoService.removeBatchByIds(ids);
}
@GetMapping
public List<CleanInfo> findAll(){

        return cleanInfoService.list();
}
@GetMapping("/{username}")
public CleanInfo findOne(@PathVariable Integer username) {
        return cleanInfoService.getById(username);
        }

@GetMapping("/page")
public Page<CleanInfo> findPage(@RequestParam Integer pageNum,
                                   @RequestParam Integer pageSize,
                                   @RequestParam(defaultValue = "") String labno,
                                   @RequestParam(defaultValue = "") String dutyusrno) {

                QueryWrapper<CleanInfo> queryWrapper = new QueryWrapper<>();
                queryWrapper.orderByDesc("clean_date");
                if(!"".equals(labno)) {
                        queryWrapper.like("labno", labno);
                }
                if(!"".equals(dutyusrno)) {
                        queryWrapper.like("duty_usr_no",dutyusrno);
                }

                return cleanInfoService.page(new Page<>(pageNum, pageSize),queryWrapper);
}




}